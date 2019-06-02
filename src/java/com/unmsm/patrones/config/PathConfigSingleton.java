/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.config;

import com.unmsm.patrones.router.Path;
import com.unmsm.patrones.router.impl.CustomerDetailPath;
import com.unmsm.patrones.router.impl.DefaultPath;
import com.unmsm.patrones.router.impl.IndexPath;
import com.unmsm.patrones.router.impl.StaffDetailPath;
import com.unmsm.patrones.util.PathName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class PathConfigSingleton {
    
    private static PathConfigSingleton instance;    
    private List<Path> listPath;

    private PathConfigSingleton() {
        listPath = new ArrayList<>();
        initPaths();
    }

    
    public final static PathConfigSingleton getInstance(){
        if(instance == null){
            instance = new PathConfigSingleton();            
        }
        return instance;
    } 
    
    private void initPaths(){
        listPath.add(new DefaultPath(PathName.DEFAULT));
        listPath.add(new IndexPath(PathName.INDEX));
        listPath.add(new CustomerDetailPath(PathName.DETAIL_CUSTOMER));
        listPath.add(new StaffDetailPath(PathName.DETAIL_STAFF));
    }

    public List<Path> getListPath() {
        return listPath;
    }
    
}
