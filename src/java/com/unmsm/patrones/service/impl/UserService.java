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
import java.util.List;

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
    public User login(String email, String password) {
        User user = this.userRepository.getByEmail(email);
        if (!user.getId().equals("0") && user.getPassword().equals(password)) {
            return user;
        } else {
            return User.NULL_USER;
        }
    }

    @Override
    public Boolean registerAccount(User user) {
        User userAux = this.userRepository.getByEmail(user.getEmail());
        if (!userAux.getId().equals("0")) {
            // EMAIL REPETIDO, EMAIL COMO VALOR UNICO
            return Boolean.FALSE;
        }
        this.userRepository.insert(user);
        return Boolean.TRUE;
    }

    @Override
    public Boolean editAccount(User user) {
        this.userRepository.update(user);
        return Boolean.TRUE;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAll();
    }
    
    
    
}
