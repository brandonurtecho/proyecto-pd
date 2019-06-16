/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto.rule;

import com.unmsm.patrones.dto.PanamericanoSport;
import com.unmsm.patrones.util.TypeSport;

/**
 *
 * @author diego
 */
public class PanamericanoSportRule implements ISportRule<PanamericanoSport>{

    @Override
    public Boolean isMatch(String type) {
        return type.equals(TypeSport.PANAMERICANO_SPORT);
    }

    @Override
    public PanamericanoSport getObject() {
        return new PanamericanoSport();
    }
    
}
