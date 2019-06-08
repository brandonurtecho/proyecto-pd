/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class Sportsman {
    private String id;
    private String firstName;
    private String lastName;
    private Country country; 
    private Date birthdate;
    private String genre;    
    private Integer age;
    private List<String> medalList;
    private Sport sport;

    public Sportsman() {
    }

}
