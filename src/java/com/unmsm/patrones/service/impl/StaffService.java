/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.Staff;
import com.unmsm.patrones.repository.IStaffReadeable;
import java.util.List;
import com.unmsm.patrones.repository.impl.StaffDao;
import com.unmsm.patrones.service.IStaffService;

/**
 *
 * @author LaboratorioFISI
 */
public class StaffService implements IStaffService {
    
    private static IStaffService staffService;
    private IStaffReadeable staffDao;

    public StaffService() {
        staffDao = new StaffDao();
    }
        
    @Override
    public List<Staff> findCustomersByCountryName(String nameParam) {
        return staffDao.findByCountryName(nameParam);
    }
    
}
