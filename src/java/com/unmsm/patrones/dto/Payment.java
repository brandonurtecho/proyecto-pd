/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class Payment {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String optionalAddress;
    private String country;
    private String state;
    private String zipCode;
    private List<Event> eventList;
    private String numberCard;
    private String paypalEmail;

    public Payment() {        
    }

    public Payment(String id, String firstName, String lastName, String email, String address, String optionalAddress, String country, String state, String zipCode, List<Event> eventList, String numberCard, String paypalEmail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.optionalAddress = optionalAddress;
        this.country = country;
        this.state = state;
        this.zipCode = zipCode;
        this.eventList = eventList;
        this.numberCard = numberCard;
        this.paypalEmail = paypalEmail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOptionalAddress() {
        return optionalAddress;
    }

    public void setOptionalAddress(String optionalAddress) {
        this.optionalAddress = optionalAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getPaypalEmail() {
        return paypalEmail;
    }

    public void getPaypalEmail(String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }

    @Override
    public String toString() {
        return "Payment{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address=" + address + ", optionalAddress=" + optionalAddress + ", country=" + country + ", state=" + state + ", zipCode=" + zipCode + ", eventList=" + eventList + ", card=" + numberCard + ", paypal=" + paypalEmail + '}';
    }

    public static final Payment NULL_PAYMENT = new Payment() {
        @Override
        public String getId() {
            return "0";
        }

        @Override
        public String getFirstName() {
            return "NULL NAME";
        }

        @Override
        public String getLastName() {
            return "NULL LASTNAME";
        }

        @Override
        public String getEmail() {
            return "NULL EMAIL";
        }

        @Override
        public String getAddress() {
            return "NULL ADDRESS";
        }

        @Override
        public String getOptionalAddress() {
            return "NULL OPTIONAL ADDRESS";
        }

        @Override
        public String getCountry() {
            return "NULL COUNTRY";
        }

        @Override
        public String getState() {
            return "NULL STATE";
        }

        @Override
        public String getZipCode() {
            return "NULL CODE";
        }

        @Override
        public List<Event> getEventList() {
            return Arrays.asList(Event.NULL_EVENT);
        }

        @Override
        public String getNumberCard() {
            return "NULL CARD";
        }

        @Override
        public String getPaypalEmail() {
            return "NULL EMAIL";
        }

    };
   
    public static class PaymentBuilder implements IBuilder<Payment> {

        private String id;
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String optionalAddress;
        private String country;
        private String state;
        private String zipCode;
        private List<Event> eventList;
        private String numberCard;
        private String paypal;
        
        public PaymentBuilder() {
           this.optionalAddress = "-";
        }

        public PaymentBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public PaymentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PaymentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PaymentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PaymentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PaymentBuilder setOptionalAddress(String optionalAddress) {
            this.optionalAddress = optionalAddress;
            return this;
        }

        public PaymentBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public PaymentBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public PaymentBuilder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public PaymentBuilder setEventList(List<Event> eventList) {
            this.eventList = eventList;
            return this;
        }

        public PaymentBuilder setNumberCard(String numberCard) {
            this.numberCard = numberCard;
            return this;
        }

        public PaymentBuilder setPaypal(String paypalEmail) {
            this.paypal = paypalEmail;
            return this;
        }

        @Override
        public Payment build() {
            return new Payment(id, firstName, lastName, email, address, optionalAddress, country, state, zipCode, eventList, numberCard, paypal);
        }

    }
}
