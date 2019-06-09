/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository;

import com.unmsm.patrones.dto.User;

/**
 *
 * @author diego
 */
public interface IUserRepository extends IUserReadeable {
    void insert(User user);
    long update(User user);
    long delete(String email);
}
