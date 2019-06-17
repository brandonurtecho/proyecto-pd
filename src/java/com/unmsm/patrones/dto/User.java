/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import com.unmsm.patrones.util.TypePerson;
import java.time.Instant;
import java.util.Calendar;
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
    
    public User(){}

    public User(String email, String password, Date birthdate, String genre) {
        this.email = email;
        this.password = password;
        this.birthdate = birthdate;
        this.genre = genre;
    }

    public User(String email, String password, Date birthdate, String genre, String id, String name, String lastname) {
        super(id, name, lastname);
        this.email = email;
        this.password = password;
        this.birthdate = birthdate;
        this.genre = genre;
    }
    
    public static final User NULL_USER = new User() {
        
        @Override
        public String getId() {
            return "0";
        }
        
        @Override
        public String getLastname() {
            return "NULL LASTNAME";
        }
        
        @Override
        public String getName() {
            return "NULL NAME";
        }
        
        @Override
        public String getEmail() {
            return "NULL EMAIL";
        }

        @Override
        public String getPassword() {
            return "NULL PASWORD";
        }

        @Override
        public Date getBirthdate() {
            return Calendar.getInstance().getTime();
        }

        @Override
        public String getGenre() {
            return "NULL GENRE";
        }
    };
    
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

    public static class UserBuilder implements IBuilder<User> {
        private String id;
        private String name;
        private String lastname;
        private String email;
        private String password;
        private Date birthdate;
        private String genre;

        public UserBuilder() {
        }

        public UserBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setBirthdate(Date birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public UserBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }
        
        @Override
        public User build() {
            return new User(email, password, birthdate, genre, id, name, lastname);
        }
        
    }
}
