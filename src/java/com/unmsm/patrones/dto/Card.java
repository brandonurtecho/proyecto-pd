/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

/**
 *
 * @author bluq1
 */
public abstract class Card {

    private String id;
    private String nameOncard;
    private String cardNumber;
    private String expiration;
    private String cvv;

    public Card() {
    }

    public Card(String id, String nameOncard, String cardNumber, String expiration, String cvv) {
        this.id = id;
        this.nameOncard = nameOncard;
        this.cardNumber = cardNumber;
        this.expiration = expiration;
        this.cvv = cvv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOncard() {
        return nameOncard;
    }

    public void setNameOncard(String nameOncard) {
        this.nameOncard = nameOncard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Card{" + "id=" + id + ", nameOncard=" + nameOncard + ", cardNumber=" + cardNumber + ", expiration=" + expiration + ", cvv=" + cvv + '}';
    }

    public static final Card NULL_CARD = new Card() {

        public String getId() {
            return "0";
        }

        public String getNameOncard() {
            return "NULL NAME";
        }

        public String getCardNumber() {
            return "NULL CARD";
        }

        public String getExpiration() {
            return "NULL EXPIRATION";
        }

        public String getCvv() {
            return "NULL CVV";
        }
    };
}
