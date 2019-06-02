/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto.rule;

import com.unmsm.patrones.dto.Staff;
import com.unmsm.patrones.util.TypePerson;

/**
 *
 * @author LaboratorioFISI
 */
public class StaffRule implements IPersonRule<Staff>{

    @Override
    public Boolean isMatch(String type) {
        return type.equals(TypePerson.STAFF);
    }

    @Override
    public Staff getObject() {
        return new Staff();
    }
    
}
