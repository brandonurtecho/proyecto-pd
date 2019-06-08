/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.repository.ICountryReadeable;
import com.unmsm.patrones.repository.impl.CountryDao;
import com.unmsm.patrones.dto.CountryP;
import com.unmsm.patrones.service.ICountryService;
import java.util.List;

/**
 *
 * @author LaboratorioFISI
 */
public class CountryService implements ICountryService {
    
    private static ICountryService countryService;
    private ICountryReadeable countryDao;

    public CountryService() {
        countryDao = new CountryDao();
    }
        
    @Override
    public List<CountryP> findAllCountries() {
        return this.countryDao.selectAll();
    }
    
}
