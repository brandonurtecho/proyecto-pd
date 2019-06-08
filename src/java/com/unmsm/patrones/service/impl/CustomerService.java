/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.Customer;
import com.unmsm.patrones.repository.ICustomerReadeable;
import com.unmsm.patrones.repository.impl.CustomerDao;
import java.util.List;
import com.unmsm.patrones.service.ICustomerService;

/**
 *
 * @author LaboratorioFISI
 */
public class CustomerService implements ICustomerService {
    
    private static ICustomerService customerService;
    private ICustomerReadeable customerDao;

    public CustomerService() {
        customerDao = new CustomerDao();
    }
        
    @Override
    public List<Customer> findCustomersByCountryName(String nameParam) {
        return customerDao.findByCountryName(nameParam);
    }
    
}
