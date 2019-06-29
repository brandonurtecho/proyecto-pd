/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.Admin;
import com.unmsm.patrones.repository.IAdminRepository;
import com.unmsm.patrones.repository.impl.AdminDao;
import com.unmsm.patrones.service.IAdminService;

/**
 *
 * @author bluq1
 */
public class AdminService implements IAdminService {
    private IAdminRepository adminRepository;
    
    public AdminService() {
        this.adminRepository = new AdminDao();
    }
    
    @Override
    public Boolean login(String email, String password) {
        Admin admin = adminRepository.getAdminByEmail(email);
        if (!admin.getId().equals("0") && admin.getPassword().equals(password)) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
    
    @Override
    public Admin getProfileByEmail(String email) {
        return adminRepository.getAdminByEmail(email);
    }
    
    @Override
    public Boolean editAccount(Admin admin) {
        this.adminRepository.update(admin);
        return Boolean.TRUE;
    }

    @Override
    public Boolean logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
