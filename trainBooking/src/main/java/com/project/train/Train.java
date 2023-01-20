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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for train complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="train">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="trainID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departureStation" type="{http://project.com/train}station"/>
 *         &lt;element name="arrivalStation" type="{http://project.com/train}station"/>
 *         &lt;element name="departureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="availableSeatsFirst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableSeatsBusiness" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableSeatsStandard" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flexiblePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nonFlexiblePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "train", propOrder = {
    "id",
    "trainID",
    "departureStation",
    "arrivalStation",
    "departureDateTime",
    "availableSeatsFirst",
    "availableSeatsBusiness",
    "availableSeatsStandard",
    "flexiblePrice",
    "nonFlexiblePrice"
})
public class Train {

    protected long id;
    @XmlElement(required = true)
    protected String trainID;
    @XmlElement(required = true)
    protected Station departureStation;
    @XmlElement(required = true)
    protected Station arrivalStation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    protected int availableSeatsFirst;
    protected int availableSeatsBusiness;
    protected int availableSeatsStandard;
    protected double flexiblePrice;
    protected double nonFlexiblePrice;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the trainID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainID() {
        return trainID;
    }

    /**
     * Sets the value of the trainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainID(String value) {
        this.trainID = value;
    }

    /**
     * Gets the value of the departureStation property.
     * 
     * @return
     *     possible object is
     *     {@link Station }
     *     
     */
    public Station getDepartureStation() {
        return departureStation;
    }

    /**
     * Sets the value of the departureStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Station }
     *     
     */
    public void setDepartureStation(Station value) {
        this.departureStation = value;
    }

    /**
     * Gets the value of the arrivalStation property.
     * 
     * @return
     *     possible object is
     *     {@link Station }
     *     
     */
    public Station getArrivalStation() {
        return arrivalStation;
    }

    /**
     * Sets the value of the arrivalStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Station }
     *     
     */
    public void setArrivalStation(Station value) {
        this.arrivalStation = value;
    }

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateTime(XMLGregorianCalendar value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the availableSeatsFirst property.
     * 
     */
    public int getAvailableSeatsFirst() {
        return availableSeatsFirst;
    }

    /**
     * Sets the value of the availableSeatsFirst property.
     * 
     */
    public void setAvailableSeatsFirst(int value) {
        this.availableSeatsFirst = value;
    }

    /**
     * Gets the value of the availableSeatsBusiness property.
     * 
     */
    public int getAvailableSeatsBusiness() {
        return availableSeatsBusiness;
    }

    /**
     * Sets the value of the availableSeatsBusiness property.
     * 
     */
    public void setAvailableSeatsBusiness(int value) {
        this.availableSeatsBusiness = value;
    }

    /**
     * Gets the value of the availableSeatsStandard property.
     * 
     */
    public int getAvailableSeatsStandard() {
        return availableSeatsStandard;
    }

    /**
     * Sets the value of the availableSeatsStandard property.
     * 
     */
    public void setAvailableSeatsStandard(int value) {
        this.availableSeatsStandard = value;
    }

    /**
     * Gets the value of the flexiblePrice property.
     * 
     */
    public double getFlexiblePrice() {
        return flexiblePrice;
    }

    /**
     * Sets the value of the flexiblePrice property.
     * 
     */
    public void setFlexiblePrice(double value) {
        this.flexiblePrice = value;
    }

    /**
     * Gets the value of the nonFlexiblePrice property.
     * 
     */
    public double getNonFlexiblePrice() {
        return nonFlexiblePrice;
    }

    /**
     * Sets the value of the nonFlexiblePrice property.
     * 
     */
    public void setNonFlexiblePrice(double value) {
        this.nonFlexiblePrice = value;
    }

}