/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository.impl;

import com.unmsm.patrones.model.Customer;
import com.unmsm.patrones.model.factory.PersonFactory;
import com.unmsm.patrones.util.TypePerson;

/**
 *
 * @author bluq1
 */
public class CustomerDao extends PersonDao<Customer> {

    public CustomerDao() {
        super("select * from customer_list where customer_list.country =?;");
    }

    @Override
    public Customer getPerson() {
        PersonFactory<Customer> factory = new PersonFactory();
        return factory.getPerson(TypePerson.CUSTOMER);
    }    
}
