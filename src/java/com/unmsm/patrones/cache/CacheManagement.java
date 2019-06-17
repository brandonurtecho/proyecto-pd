/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.cache;

//import com.unmsm.patrones.service.impl.CountryService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author bluq1
 */
public class CacheManagement {
    
    private static CacheManagement cache;
    private Map<String, List<?>> cacheMap;
        
    private CacheManagement() {
        //CountryService countryService = new CountryService();
        cacheMap = new HashMap<>();
        //cacheMap.put(CacheName.COUNTRY, countryService.findAllCountries());
    }
    
    public static CacheManagement getInstance(){
        if(cache == null){
            cache = new CacheManagement();
        }
        return cache;
    }
        
    public List getCache(String type) {        
        return cacheMap.get(type);
    }

}
