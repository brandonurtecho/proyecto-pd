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
    
    
}
