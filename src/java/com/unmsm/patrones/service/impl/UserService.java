/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.repository.IUserRepository;
import com.unmsm.patrones.repository.impl.UserDao;
import com.unmsm.patrones.service.IUserService;

/**
 *
 * @author bluq1
 */
public class UserService implements IUserService{
    
    private IUserRepository userRepository;

    public UserService() {
        this.userRepository = new UserDao();
    }
    
    @Override
    public Boolean login(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registerAccount(User user) {
        this.userRepository.insert(user);
        return Boolean.TRUE;
    }

    @Override
    public Boolean editAccount(User user) {
        this.userRepository.update(user);
        return Boolean.TRUE;
    }
    
}
