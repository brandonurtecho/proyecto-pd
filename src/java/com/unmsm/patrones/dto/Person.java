/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

/**
 *
 * @author diego
 */
public abstract class Person {
    private String id;
    private String name;
    private String lastname;
    
    public Person() {}

    public Person(String id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public static final Person NULL_PERSON = new Person() {
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
        public String getType() {
            return "NULL TYPE";
        }
    };
    
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", lastname=" + lastname + '}';
    }
    
    public abstract String getType();
}
