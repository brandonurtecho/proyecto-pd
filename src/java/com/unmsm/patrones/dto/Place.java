/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author diego
 */
public class Place {
    private String id;
    private String name;
    private String description;
    private List<String> venues;

    public Place() {}
    
    public Place(String id, String name, String description, List<String> venues) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.venues = venues;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getVenues() {
        return venues;
    }

    public void setVanues(List<String> venues) {
        this.venues = venues;
    }
    
    public static final Place NULL_PLACE = new Place() {
        @Override
        public String getId() {
            return "0";
        }
        @Override
        public String getName() {
            return "NULL NAME";
        }        
        @Override
        public String getDescription() {
            return "NULL DESCRIPTION";
        }
        @Override
        public List<String> getVenues() {
            return Arrays.asList("NULL VENUES");
        }   
    };

    @Override
    public String toString() {
        return "Place{" + "id=" + id + ", name=" + name + ", description=" + description + ", vanues=" + venues + '}';
    }
    
    public static class PlaceBuilder implements IBuilder<Place> {
        private String id;
        private String name;
        private String description;
        private List<String> venues;
        
        public PlaceBuilder() {}

        public PlaceBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public PlaceBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaceBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public PlaceBuilder setVenues(List<String> venues) {
            this.venues = venues;
            return this;
        }
        
        @Override
        public Place build() {
            return new Place(id, name, description, venues);
        }
        
    }
}
