/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import com.unmsm.patrones.util.TypePerson;
import java.util.Date;

/**
 *
 * @author bluq1
 */
public class User extends Person {
    private String email;
    private String password;
    private Date birthdate;
    private String genre;
    
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
        return "User{" + "email=" + email + ", password=" + password + ", birthdate=" + birthdate + ", genre=" + genre + '}';
    }

    @Override
    public String getType() {
        return TypePerson.USER;
    }

}
