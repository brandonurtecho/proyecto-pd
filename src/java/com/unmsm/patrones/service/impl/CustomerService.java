/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.repository.impl.PersonDao;
import com.unmsm.patrones.model.Person;
import java.util.List;
import com.unmsm.patrones.repository.impl.CustomerDao;
import com.unmsm.patrones.service.IPersonService;

/**
 *
 * @author LaboratorioFISI
 */
public class CustomerService implements IPersonService{
    
    private static IPersonService customerService;
    private PersonDao personDao;

    private CustomerService() {
        personDao = new CustomerDao();
    }
    
    public static IPersonService getInstance(){
        if(customerService == null){
            customerService = new CustomerService();
        }
        return customerService;
    }
    
    @Override
    public List<Person> findCustomersByCountryName(String nameParam) {
        return personDao.findByCountryName(nameParam);
    }
    
}
