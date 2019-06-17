/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import com.unmsm.patrones.util.TypePerson;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
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

    public Sportsman(){}
    
    public Sportsman(Country country, Date birthdate, String genre, Integer age, List<String> medalList, Sport sport) {
        this.country = country;
        this.birthdate = birthdate;
        this.genre = genre;
        this.age = age;
        this.medalList = medalList;
        this.sport = sport;
    }

    public Sportsman(Country country, Date birthdate, String genre, Integer age, List<String> medalList, Sport sport, String id, String name, String lastname) {
        super(id, name, lastname);
        this.country = country;
        this.birthdate = birthdate;
        this.genre = genre;
        this.age = age;
        this.medalList = medalList;
        this.sport = sport;
    }

    public static final Sportsman NULL_SPORTSMAN = new Sportsman() {
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
        public Country getCountry() {
            return Country.NULL_COUNTRY;
        }

        @Override
        public Date getBirthdate() {
            return Calendar.getInstance().getTime();
        }

        @Override
        public String getGenre() {
            return "SOLO EXISTE 2 GENEROS";
        }

        @Override
        public Integer getAge() {
            return 0;
        }

        @Override
        public List<String> getMedalList() {
            return Arrays.asList("NULL LIST");
        }

        @Override
        public Sport getSport() {
            return Sport.NULL_SPORT;
        }    
    };
    
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

    public static class SportsmanBuilder implements IBuilder<Sportsman> {
        private String id;
        private String name;
        private String lastname;
        private Country country; 
        private Date birthdate;
        private String genre;    
        private Integer age;
        private List<String> medalList;
        private Sport sport;

        public SportsmanBuilder() {
        }

        public SportsmanBuilder setCountry(Country country) {
            this.country = country;
            return this;
        }

        public SportsmanBuilder setBirthdate(Date birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public SportsmanBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public SportsmanBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public SportsmanBuilder setMedalList(List<String> medalList) {
            this.medalList = medalList;
            return this;
        }

        public SportsmanBuilder setSport(Sport sport) {
            this.sport = sport;
            return this;
        }

        public SportsmanBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public SportsmanBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public SportsmanBuilder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }
        
        @Override
        public Sportsman build() {
            return new Sportsman(country, birthdate, genre, age, medalList, sport, id, name, lastname);
        }
        
    }
}