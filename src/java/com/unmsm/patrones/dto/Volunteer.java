/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import com.unmsm.patrones.util.TypePerson;

/**
 *
 * @author bluq1
 */
public class Volunteer extends Person {
    private String photo;
    private String job;
    private String place;
    
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    
    @Override
    public String getType() {
        return TypePerson.VOLUNTEER;
    }

    public static final Volunteer NULL_VOLUNTEER = new Volunteer() {
        @Override
        public String getId() {
            return "0";
        }
        
        @Override
        public String getName() {
            return "NULL NAME";
        }
        
        @Override
        public String getLastname() {
            return "NULL LASTNAME";
        }
        
        @Override
        public String getPhoto() {
            return "assets/img/NOT_FOUND.jpg";
        }
        
        @Override
        public String getJob() {
            return "NULL JOB";
        }
        
        @Override
        public String getPlace() {
            return "NULL PLACE";
        }
    };
}
