/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto.factory;

import com.unmsm.patrones.dto.Sport;
import com.unmsm.patrones.dto.rule.ISportRule;
import com.unmsm.patrones.dto.rule.PanamericanoSportRule;
import com.unmsm.patrones.dto.rule.ParapanamericanoSportRule;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class SportFactory<T extends Sport> {
    private List<ISportRule> listSportRule;
    
    public SportFactory() {
        listSportRule = new ArrayList<>();
        listSportRule.add(new PanamericanoSportRule());
        listSportRule.add(new ParapanamericanoSportRule());
    }
    
    public T getSport(String type){
        for (ISportRule<T> sportRule : listSportRule) {
            if(sportRule.isMatch(type)){
                return sportRule.getObject();
            }
        }
        return null;
    }
}
