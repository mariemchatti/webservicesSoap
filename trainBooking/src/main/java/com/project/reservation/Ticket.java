package com.project.reservation;

import com.project.train.TrainClass;

public class Ticket {


    private String trainClass;
    private String ticketType;
    private Integer numberOfTickets;
    private Integer outboundTrainId;
    private Integer returnTrainId;

    public Ticket(String trainClass, String ticketType, Integer numberOfTickets, Integer outboundTrainId,
                  Integer returnTrainId) {
        this.trainClass = trainClass;
        this.ticketType = ticketType;
        this.numberOfTickets = numberOfTickets;
        this.outboundTrainId = outboundTrainId;
        this.returnTrainId = returnTrainId;
    }

    public String getTrainClass() {
        return trainClass;
    }

    public void setTrainClass(String trainClass) {
        this.trainClass = trainClass;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public Integer getOutboundTrainId() {
        return outboundTrainId;
    }

    public void setOutboundTrainId(Integer outboundTrainId) {
        this.outboundTrainId = outboundTrainId;
    }

    public Integer getReturnTrainId() {
        return returnTrainId;
    }

    public void setReturnTrainId(Integer returnTrainId) {
        this.returnTrainId = returnTrainId;
    }
}


