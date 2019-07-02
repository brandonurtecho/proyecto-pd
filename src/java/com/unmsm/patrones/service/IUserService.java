/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service;

import com.unmsm.patrones.dto.User;
import java.util.List;

/**
 *
 * @author bluq1
 */
public interface IUserService {
    User login(String email, String password);
    User registerAccount(User user);
    Boolean editAccount(User user);
    List<User> getAllUsers();
    //Boolean validateAccount(String token);
}
