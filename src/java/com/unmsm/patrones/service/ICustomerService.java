/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service;

import com.unmsm.patrones.dto.Customer;
import java.util.List;

/**
 *
 * @author LaboratorioFISI
 */
public interface ICustomerService {
    List<Customer> findCustomersByCountryName(String nameParam);
}
