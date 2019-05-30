/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository.impl;

import com.unmsm.patrones.util.TypePerson;

/**
 *
 * @author bluq1
 */
public class CustomerDao extends PersonDao {

    public CustomerDao() {
        super("select * from customer_list where customer_list.country =?;", TypePerson.CUSTOMER);
    }

}
