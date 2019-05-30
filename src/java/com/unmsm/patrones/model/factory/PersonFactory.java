/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.model.factory;

import com.unmsm.patrones.model.Person;
import com.unmsm.patrones.model.rule.CustomerRule;
import com.unmsm.patrones.model.rule.IPersonRule;
import com.unmsm.patrones.model.rule.StaffRule;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LaboratorioFISI
 */
public class PersonFactory {

    private List<IPersonRule> listPersonRule;
    
    public PersonFactory() {
        listPersonRule = new ArrayList<>();
        listPersonRule.add(new CustomerRule());
        listPersonRule.add(new StaffRule());
    }   
    
    public Person getPerson(String type){
        for (IPersonRule personRule : listPersonRule) {
            if(personRule.isMatch(type)){
                return personRule.getObject();
            }
        }
        return null;
    }
    
}
