/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

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
    private Card card;
    private Paypal paypal;

    public Payment() {
    }
    
    
}
