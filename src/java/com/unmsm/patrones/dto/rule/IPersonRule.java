/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto.rule;

import com.unmsm.patrones.dto.Person;

/**
 *
 * @author diego
 */
public interface IPersonRule<T extends Person> {
    Boolean isMatch(String type);
    T getObject();
}
