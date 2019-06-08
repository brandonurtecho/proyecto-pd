/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import java.util.Date;

/**
 *
 * @author bluq1
 */
public class User {
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private Date birthdate;
    private String genre;

    public User() {
    }

    public User(String id, String name, String lastName, String email, String password, Date birthdate, String genre) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.birthdate = birthdate;
        this.genre = genre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", password=" + password + ", birthdate=" + birthdate + ", genre=" + genre + '}';
    }

    
}
