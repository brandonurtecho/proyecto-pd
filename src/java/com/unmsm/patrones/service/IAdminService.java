/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service;

import com.unmsm.patrones.dto.Admin;
import com.unmsm.patrones.dto.Person;

/**
 *
 * @author bluq1
 */
public interface IAdminService {
    Boolean login(String email, String password);
    Admin getProfileByEmail(String email);
    Boolean editAccount(Admin admin);
    Boolean logout();
}
