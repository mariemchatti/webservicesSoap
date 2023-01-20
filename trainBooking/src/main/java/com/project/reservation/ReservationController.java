package com.project.reservation;

import jakarta.xml.bind.JAXBElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.namespace.QName;


@Endpoint
@Controller
public class ReservationController {

    @Autowired
    private RestTemplate restTemplate;
    private static final String NAMESPACE_URI = "http://project.com/reservation";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addReservationRequest")
    @ResponsePayload
    public JAXBElement<AddReservationResponse> updateReservation(@RequestPayload JAXBElement<AddReservationRequest>
                                                                             request) {
        AddReservationResponse response = new ObjectFactory().createAddReservationResponse();

        int outboundTrainId = request.getValue().getOutboundTrainId();
        int returnTrainId = request.getValue().getReturnTrainId();
        String ticketType = request.getValue().getTicketType();
        String trainClass= request.getValue().getTrainClass();
        int nbTickets= request.getValue().getNbTickets();

        String urlAdd = "http://project.com/reservations/book/" ;
            boolean restAddResponse = restTemplate.postForObject(urlAdd,new Ticket(trainClass,ticketType,nbTickets,
                    outboundTrainId,returnTrainId),boolean.class);

        String urlUpdate = "http://project.com/trains/update/" ;

            if (restAddResponse){
                response.setResultText("Successful reservation");
                restTemplate.postForObject(urlUpdate,new Ticket(trainClass,ticketType,nbTickets,
                        outboundTrainId,returnTrainId),boolean.class);
            }
            else {
                response.setResultText("Reservation Error");
            }
        return createAddReservationJaxbElement(response, AddReservationResponse.class);
    }


    private JAXBElement<AddReservationResponse> createAddReservationJaxbElement(AddReservationResponse object, Class clazz) {
        return new JAXBElement<>(new QName(NAMESPACE_URI, clazz.getSimpleName()), clazz, object);

    }
}
