/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service;

import com.unmsm.patrones.model.Person;
import java.util.List;

/**
 *
 * @author LaboratorioFISI
 */
public interface IPersonService {
    List<Person> findCustomersByCountryName(String nameParam);
}
