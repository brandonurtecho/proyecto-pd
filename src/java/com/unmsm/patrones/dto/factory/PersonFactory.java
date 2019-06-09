/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto.factory;

import com.unmsm.patrones.dto.Person;
import com.unmsm.patrones.dto.rule.AdminRule;
import com.unmsm.patrones.dto.rule.IPersonRule;
import com.unmsm.patrones.dto.rule.SportsmanRule;
import com.unmsm.patrones.dto.rule.UserRule;
import com.unmsm.patrones.dto.rule.VolunteerRule;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class PersonFactory<T extends Person> {
    private List<IPersonRule> listPersonRule;
    
    public PersonFactory() {
        listPersonRule = new ArrayList<>();
        listPersonRule.add(new AdminRule());
        listPersonRule.add(new SportsmanRule());
        listPersonRule.add(new UserRule());
        listPersonRule.add(new VolunteerRule());
    }   
    
    public T getPerson(String type){
        for (IPersonRule<T> personRule : listPersonRule) {
            if(personRule.isMatch(type)){
                return personRule.getObject();
            }
        }
        return null;
    }
}
