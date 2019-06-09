/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import com.unmsm.patrones.util.TypePerson;
import java.util.Date;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class Sportsman extends Person{
    private Country country; 
    private Date birthdate;
    private String genre;    
    private Integer age;
    private List<String> medalList;
    private Sport sport;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getMedalList() {
        return medalList;
    }

    public void setMedalList(List<String> medalList) {
        this.medalList = medalList;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Sportsman{" + "country=" + country + ", birthdate=" + birthdate + ", genre=" + genre + ", age=" + age + ", medalList=" + medalList + ", sport=" + sport + '}';
    }

    @Override
    public String getType() {
        return TypePerson.SPORTSMAN;
    }

}