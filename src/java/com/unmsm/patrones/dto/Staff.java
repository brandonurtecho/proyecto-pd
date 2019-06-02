/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import com.unmsm.patrones.util.TypePerson;

/**
 *
 * @author LaboratorioFISI
 */
public class Staff extends Person {

    @Override
    public String getType() {
        return TypePerson.STAFF;
    }
    
}
