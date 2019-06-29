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
public class Admin extends Person {
    private String email;
    private String password;
    private String dni;
    private String phone;
    private String age;
    private String genre;

    public Admin() {}
    
    public Admin(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Admin(String email, String password, String name, String lastname, String dni, String phone, String age, String genre) {
        super("0", name, lastname);
        this.email = email;
        this.password = password;
        this.dni = dni;
        this.phone = phone;
        this.age = age;
        this.genre = genre;
    }
    
    public static final Admin NULL_ADMIN = new Admin() {
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
        public String getEmail() {
            return "NULL EMAIL";
        }

        @Override
        public String getPassword() {
            return "NULL PASSWORD";
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Admin{" + "email=" + email + ", password=" + password + '}';
    }

    @Override
    public String getType() {
        return TypePerson.ADMIN;
    }
    
    public static class AdminBuilder implements IBuilder<Admin> {

        private String id;
        private String name;
        private String lastname;
        private String email;
        private String password;
        private String dni;
        private String phone;
        private String age;
        private String genre;

        public AdminBuilder() {
        }

        public AdminBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public AdminBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AdminBuilder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public AdminBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public AdminBuilder setPassword(String password) {
            this.password = password;
            return this;
        }
        
        public AdminBuilder setDni(String dni) {
            this.dni = dni;
            return this;
        }

        public AdminBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public AdminBuilder setAge(String age) {
            this.age = age;
            return this;
        }

        public AdminBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }
        
        @Override
        public Admin build() {
            return new Admin(email, password, name, lastname, dni, phone, age, genre);
        }
        
    }
    
}
