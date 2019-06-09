/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service;

import com.unmsm.patrones.dto.User;

/**
 *
 * @author bluq1
 */
public interface IUserService {
    Boolean login(String email, String password);
    Boolean registerAccount(User user);
    Boolean editAccount(User user);
    //Boolean validateAccount(String token);
}
