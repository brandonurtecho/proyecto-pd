/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

/**
 *
 * @author LaboratorioFISI
 */
public abstract class Person {
    
    private Integer id;
    private String name;
    private String address;
    private String zipCode;
    private String phone;
    private String city;
    private String country;
    private Boolean sid;

    public Person() {
    }

    public Person(Integer id, String name, String address, String zipCode, String phone, String city, String country, Boolean sid) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.sid = sid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getSid() {
        return sid;
    }

    public void setSid(Boolean sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", address=" + address + ", zipCode=" + zipCode + ", phone=" + phone + ", city=" + city + ", country=" + country + ", sid=" + sid + '}';
    }
    
    public abstract String getType();
}
