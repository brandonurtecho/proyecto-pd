/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.repository.ICountryReadeable;
import com.unmsm.patrones.repository.impl.CountryDao;
import com.unmsm.patrones.model.Country;
import com.unmsm.patrones.service.ICountryService;
import java.util.List;

/**
 *
 * @author LaboratorioFISI
 */
public class CountryService implements ICountryService {
    
    private ICountryReadeable countryReadeable;

    public CountryService() {
        countryReadeable = new CountryDao();
    }
    
    @Override
    public List<Country> findAllCountries() {
        return this.countryReadeable.selectAll();
    }
    
}
