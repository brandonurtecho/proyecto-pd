/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto.rule;

import com.unmsm.patrones.dto.Volunteer;
import com.unmsm.patrones.util.TypePerson;

/**
 *
 * @author diego
 */
public class VolunteerRule implements IPersonRule<Volunteer>{

    @Override
    public Boolean isMatch(String type) {
        return type.equals(TypePerson.VOLUNTEER);
    }

    @Override
    public Volunteer getObject() {
        return new Volunteer();
    }
    
}
