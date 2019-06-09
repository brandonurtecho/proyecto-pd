/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto.rule;

import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.util.TypePerson;

/**
 *
 * @author diego
 */
public class UserRule implements IPersonRule<User> {

    @Override
    public Boolean isMatch(String type) {
        return type.equals(TypePerson.USER);
    }

    @Override
    public User getObject() {
        return new User();
    }

}
