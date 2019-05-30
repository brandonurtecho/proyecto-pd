/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.model.rule;

import com.unmsm.patrones.model.Person;
import com.unmsm.patrones.model.Staff;
import com.unmsm.patrones.util.TypePerson;

/**
 *
 * @author LaboratorioFISI
 */
public class StaffRule implements IPersonRule{

    @Override
    public Boolean isMatch(String type) {
        return type.equals(TypePerson.STAFF);
    }

    @Override
    public Person getObject() {
        return new Staff();
    }
    
}
