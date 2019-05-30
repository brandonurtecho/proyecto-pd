/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.model.rule;

import com.unmsm.patrones.model.Person;

/**
 *
 * @author LaboratorioFISI
 */
public interface IPersonRule {
    Boolean isMatch(String type);
    Person getObject();
}
