/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.repository.impl.PersonDao;
import com.unmsm.patrones.model.Person;
import java.util.List;
import com.unmsm.patrones.repository.impl.StaffDao;
import com.unmsm.patrones.service.IPersonService;

/**
 *
 * @author LaboratorioFISI
 */
public class StaffService implements IPersonService {
    
    private PersonDao personDao;

    public StaffService() {
        personDao = new StaffDao();
    }
    
    @Override
    public List<Person> findCustomersByCountryName(String nameParam) {
        return personDao.findByCountryName(nameParam);
    }
    
}
