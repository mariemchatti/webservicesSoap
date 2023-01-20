package com.project.train;


import com.project.exception.TrainNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import jakarta.xml.bind.JAXBElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.util.List;

@Endpoint
@Controller
public class TrainController {
    @Autowired
    private RestTemplate restTemplate;
    private static final String NAMESPACE_URI = "http://project.com/train";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTrainRequest")
    @ResponsePayload
    public JAXBElement<GetTrainResponse> getTrains(@RequestPayload JAXBElement<GetTrainRequest> request) throws TrainNotFoundException {
        GetTrainResponse response = new ObjectFactory().createGetTrainResponse();
        try{
        String departureStation = request.getValue().getDepartureStationName();
        String arrivalStation = request.getValue().getArrivalStationName();
        XMLGregorianCalendar outboundDate = request.getValue().getOutboundDateTime();
        XMLGregorianCalendar returnDate = request.getValue().getReturnDateTime();
        int tickets = request.getValue().getNumberOfTickets();
        TrainClass travelClass = request.getValue().getTravelClass();

        String url = "http://project.com/trains/from/" + departureStation + "/to/" + arrivalStation + "/outboundDate/"
                + outboundDate.toString() + "/returnDate/" + returnDate.toString() + "/tickets/" + tickets + "/travelClass/" + travelClass;
        List<Train> trains;
            trains = restTemplate.getForObject(url, List.class);
            response.getTrain().addAll(trains);

        } catch (EntityNotFoundException e) {
            throw TrainNotFoundException.create(e.getMessage());
        }
        return createAddResponseJaxbElement(response, GetTrainResponse.class);
    }

    private JAXBElement<GetTrainResponse> createAddResponseJaxbElement(GetTrainResponse object, Class clazz) {
        return new JAXBElement<>(new QName(NAMESPACE_URI, clazz.getSimpleName()), clazz, object);
    }

}