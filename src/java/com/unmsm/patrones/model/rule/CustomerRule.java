/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.model.rule;

import com.unmsm.patrones.model.Customer;
import com.unmsm.patrones.util.TypePerson;

/**
 *
 * @author LaboratorioFISI
 */
public class CustomerRule implements IPersonRule<Customer>{

    @Override
    public Boolean isMatch(String type) {
        return type.equals(TypePerson.CUSTOMER);
    }

    @Override
    public Customer getObject() {
        return new Customer();
    }
    
}
