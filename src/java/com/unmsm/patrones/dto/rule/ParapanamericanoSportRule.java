/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto.rule;

import com.unmsm.patrones.dto.ParapanamericanoSport;
import com.unmsm.patrones.util.TypeSport;

/**
 *
 * @author diego
 */
public class ParapanamericanoSportRule implements ISportRule<ParapanamericanoSport>{

    @Override
    public Boolean isMatch(String type) {
        return type.equals(TypeSport.PARAPANAMERICANO_SPORT);
    }

    @Override
    public ParapanamericanoSport getObject() {
        return new ParapanamericanoSport();
    }
    
}
