/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.config;

import com.unmsm.patrones.model.Country;
import com.unmsm.patrones.service.impl.CountryService;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class Cache {
    
    private static Cache cache;    
    private List<Country> listCountry;
        
    private Cache() {
        listCountry = CountryService.getInstance().findAllCountries();
    }
    
    public static Cache getInstance(){
        if(cache == null){
            cache = new Cache();
        }
        return cache;
    }
    
    
    public List<Country> getListCountry() {        
        return listCountry;
    }

}
