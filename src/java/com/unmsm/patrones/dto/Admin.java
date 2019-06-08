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
public class Admin {
    private String id;
    private String email;
    private String password;

    public Admin() {
    }

    public Admin(String id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    
}
