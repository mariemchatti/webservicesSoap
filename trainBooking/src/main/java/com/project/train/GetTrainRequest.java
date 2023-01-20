//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.18 at 01:21:22 AM CET 
//


package com.project.train;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departureStationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ArrivalStationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OutboundDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReturnDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumberOfTickets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TravelClass" type="{http://project.com/train}TrainClass"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "departureStationName",
    "arrivalStationName",
    "outboundDateTime",
    "returnDateTime",
    "numberOfTickets",
    "travelClass"
})
@XmlRootElement(name = "getTrainRequest")
public class GetTrainRequest {

    @XmlElement(required = true)
    protected String departureStationName;
    @XmlElement(name = "ArrivalStationName", required = true)
    protected String arrivalStationName;
    @XmlElement(name = "OutboundDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outboundDateTime;
    @XmlElement(name = "ReturnDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDateTime;
    @XmlElement(name = "NumberOfTickets")
    protected int numberOfTickets;
    @XmlElement(name = "TravelClass", required = true)
    protected TrainClass travelClass;

    /**
     * Gets the value of the departureStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureStationName() {
        return departureStationName;
    }

    /**
     * Sets the value of the departureStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureStationName(String value) {
        this.departureStationName = value;
    }

    /**
     * Gets the value of the arrivalStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalStationName() {
        return arrivalStationName;
    }

    /**
     * Sets the value of the arrivalStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalStationName(String value) {
        this.arrivalStationName = value;
    }

    /**
     * Gets the value of the outboundDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutboundDateTime() {
        return outboundDateTime;
    }

    /**
     * Sets the value of the outboundDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutboundDateTime(XMLGregorianCalendar value) {
        this.outboundDateTime = value;
    }

    /**
     * Gets the value of the returnDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDateTime() {
        return returnDateTime;
    }

    /**
     * Sets the value of the returnDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDateTime(XMLGregorianCalendar value) {
        this.returnDateTime = value;
    }

    /**
     * Gets the value of the numberOfTickets property.
     * 
     */
    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    /**
     * Sets the value of the numberOfTickets property.
     * 
     */
    public void setNumberOfTickets(int value) {
        this.numberOfTickets = value;
    }

    /**
     * Gets the value of the travelClass property.
     * 
     * @return
     *     possible object is
     *     {@link TrainClass }
     *     
     */
    public TrainClass getTravelClass() {
        return travelClass;
    }

    /**
     * Sets the value of the travelClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainClass }
     *     
     */
    public void setTravelClass(TrainClass value) {
        this.travelClass = value;
    }

}
