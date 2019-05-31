/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.config;

import com.unmsm.patrones.model.Country;
import com.unmsm.patrones.service.impl.CountryService;
import com.unmsm.patrones.util.CacheName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author bluq1
 */
public class Cache {
    
    private static Cache cache;
    private Map<String, List> cacheMap;
        
    private Cache() {
        cacheMap = new HashMap<>();
        cacheMap.put(CacheName.COUNTRY, CountryService.getInstance().findAllCountries());
    }
    
    public static Cache getInstance(){
        if(cache == null){
            cache = new Cache();
        }
        return cache;
    }
        
    public List getCache(String type) {        
        return cacheMap.get(type);
    }

}
