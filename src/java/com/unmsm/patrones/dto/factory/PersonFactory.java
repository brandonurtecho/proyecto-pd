/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto.factory;

import com.unmsm.patrones.dto.Person;
import com.unmsm.patrones.dto.rule.CustomerRule;
import com.unmsm.patrones.dto.rule.IPersonRule;
import com.unmsm.patrones.dto.rule.StaffRule;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LaboratorioFISI
 * @param <T>
 */
public class PersonFactory<T extends Person> {

    private List<IPersonRule> listPersonRule;
    
    public PersonFactory() {
        listPersonRule = new ArrayList<>();
        listPersonRule.add(new CustomerRule());
        listPersonRule.add(new StaffRule());
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
