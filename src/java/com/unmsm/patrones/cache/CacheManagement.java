/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.cache;

//import com.unmsm.patrones.service.impl.CountryService;
import com.unmsm.patrones.dto.Sport;
import com.unmsm.patrones.service.facade.IUserFacadeService;
import com.unmsm.patrones.service.facade.impl.UserFacadeService;
import com.unmsm.patrones.util.TypeSport;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author bluq1
 */
public class CacheManagement {
    
    private static CacheManagement cache;
    private Map<String, List<? extends Sport>> cacheMap;
        
    private CacheManagement() {
        IUserFacadeService userService = new UserFacadeService();
        cacheMap = new HashMap<>();
        cacheMap.put(TypeSport.PANAMERICANO_SPORT, 
                userService.showSportList(TypeSport.PANAMERICANO_SPORT));
        cacheMap.put(TypeSport.PARAPANAMERICANO_SPORT, 
                userService.showSportList(TypeSport.PARAPANAMERICANO_SPORT));
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
