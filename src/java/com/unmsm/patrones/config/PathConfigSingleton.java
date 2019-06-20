/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.config;

import com.unmsm.patrones.router.PathStrategy;
import com.unmsm.patrones.router.impl.DefaultPath;

import com.unmsm.patrones.router.impl.DisciplinesPath;
import com.unmsm.patrones.router.impl.EditProfilePath;
import com.unmsm.patrones.router.impl.EventsPath;

import com.unmsm.patrones.router.impl.IndexPath;
import com.unmsm.patrones.router.impl.InitialPath;
import com.unmsm.patrones.router.impl.LoginAdminPath;
import com.unmsm.patrones.router.impl.MainContentPath;
import com.unmsm.patrones.router.impl.PaymentsPath;
import com.unmsm.patrones.router.impl.SportCommentariesPath;
import com.unmsm.patrones.router.impl.SportmanPath;
import com.unmsm.patrones.router.impl.VenueAttendeesPath;
import com.unmsm.patrones.router.impl.VenueCommentariesPath;
import com.unmsm.patrones.router.impl.ViewProfilePath;
import com.unmsm.patrones.router.impl.VoluntaryPath;

import com.unmsm.patrones.util.PathName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class PathConfigSingleton {
    
    private static PathConfigSingleton instance;    
    private List<PathStrategy> listPath;

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
        initUserPath();
        initAdminPath();
    }
    
    private void initUserPath(){
        listPath.add(new DefaultPath(PathName.DEFAULT));
        
        /******************/
        
        listPath.add(new IndexPath(PathName.INDEX));
        listPath.add(new InitialPath(PathName.INITIAL));
        listPath.add(new DisciplinesPath(PathName.DISCIPLINES));
        listPath.add(new EventsPath(PathName.EVENTS));
        listPath.add(new PaymentsPath(PathName.PAYMENTS));
        listPath.add(new SportmanPath(PathName.SPORTMAN));
        listPath.add(new VoluntaryPath(PathName.VOLUNTARY));
        //***********************/
        
    }
        
    private void initAdminPath(){
        listPath.add(new LoginAdminPath(PathName.LOGIN_ADMIN));
        listPath.add(new MainContentPath(PathName.MAIN_CONTENT));
        listPath.add(new ViewProfilePath(PathName.VIEW_PROFILE));
        listPath.add(new EditProfilePath(PathName.EDIT_PROFILE));
        listPath.add(new SportCommentariesPath(PathName.SPORT_COMMENTARIES));
        listPath.add(new VenueCommentariesPath(PathName.VENUE_COMMENTARIES));
        listPath.add(new VenueAttendeesPath(PathName.VENUE_ATTENDEES));
    }

    public List<PathStrategy> getListPath() {
        return listPath;
    }
    
}
