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
public class Paypal {
    private String id;
    private String account;
    private String password;

    public Paypal() {
    }

    public Paypal(String id, String account, String password) {
        this.id = id;
        this.account = account;
        this.password = password;
    }
    
}
