/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository.impl;

import com.unmsm.patrones.dto.Staff;
import com.unmsm.patrones.dto.factory.PersonFactory;
import com.unmsm.patrones.util.TypePerson;

/**
 *
 * @author bluq1
 */
public class StaffDao extends PersonDao<Staff> {
    
    public StaffDao() {
        super("select * from staff_list where staff_list.country =?;");
    }
    
    @Override
    public Staff getPerson() {
        PersonFactory<Staff> factory = new PersonFactory();
        return factory.getPerson(TypePerson.STAFF);
    } 
}
