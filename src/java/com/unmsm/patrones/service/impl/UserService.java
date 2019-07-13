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
import com.unmsm.patrones.service.crypt.ICryptBridgeService;
import com.unmsm.patrones.service.crypt.impl.DefaultCryptBrigdeService;
import com.unmsm.patrones.util.TypeCrypt;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bluq1
 */
public class UserService implements IUserService{
    
    private IUserRepository userRepository;
    private ICryptBridgeService cryptService;

    public UserService() {
        this.userRepository = new UserDao();
        this.cryptService = new DefaultCryptBrigdeService();
    }
    
    @Override
    public User login(String email, String password) {
        User user = this.userRepository.getByEmail(email);
        String passwordCrypt = "";
        
        try {
            passwordCrypt = 
                    cryptService.encryptMessage(password, TypeCrypt.USER);
        } catch (Exception ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (!user.getId().equals("0") && user.getPassword().equals(passwordCrypt)) {
            return user;
        } else {
            return User.NULL_USER;
        }
    }

    @Override
    public User registerAccount(User user) {
        User userAux = this.userRepository.getByEmail(user.getEmail());
        String passwordCrypt = "";
        
        if (!userAux.getId().equals("0")) {
            // EMAIL UNIQUE
            return userAux;
        }
        
        try {
            // CRYPT PASSWORD
            passwordCrypt =
                    cryptService.encryptMessage(user.getPassword(), TypeCrypt.USER);
            user.setPassword(passwordCrypt);
        } catch (Exception ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.userRepository.insert(user);
        User userRegister = this.userRepository.getByEmail(user.getEmail());
        return userRegister;
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
