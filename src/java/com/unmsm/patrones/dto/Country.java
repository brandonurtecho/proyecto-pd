/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class Country {
    private String id;
    private String country;
    private List<String> medalList;

    public Country() {
    }

    public Country(String id, String country, List<String> medalList) {
        this.id = id;
        this.country = country;
        this.medalList = medalList;
    }

    public static final Country NULL_COUNTRY = new Country() {
        @Override
        public String getId() {
            return "0";
        }

        
        @Override
        public String getCountry() {
            return "NULL COUNTRY";
        }

        @Override
        public List<String> getMedalList() {
            List<String> list = new ArrayList<>();
            list.add("NULL LIST");
            return list;
        }    
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getMedalList() {
        return medalList;
    }

    public void setMedalList(List<String> medalList) {
        this.medalList = medalList;
    }
    
    public static class CountryBuilder implements IBuilder<Country> {
        private String id;
        private String country;
        private List<String> medalList;

        public CountryBuilder() {
        }

        public CountryBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public CountryBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public CountryBuilder setMedalList(List<String> medalList) {
            this.medalList = medalList;
            return this;
        }
        
        @Override
        public Country build() {
            return new Country(id, country, medalList);
        }
        
    }
}
