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
public class Staff {
    
    private Integer id;
    private String name;
    private String address;
    private String zipCode;
    private String phone;
    private String city;
    private String country;
    private Boolean sid;
    
    public static final Staff NULL_STAFF = new Staff() {
        
        @Override
        public Integer getId() {
            return 0;
        }

        @Override
        public String getName() {
            return "NULL NAME";
        }

        @Override
        public String getAddress() {
            return "NULL ADDRESS";
        }

        @Override
        public String getZipCode() {
            return "NULL ZIPCODE";
        }
        
        @Override
        public String getPhone() {
            return "NULL PHONE";
        }

        @Override
        public String getCity() {
            return "NULL CITY";
        }

        @Override
        public String getCountry() {
            return "NULL COUNTRY";
        }

        @Override
        public Boolean getSid() {
            return Boolean.FALSE;
        }
    };

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
        return "Staff{" + "id=" + id + ", name=" + name + ", address=" + address + ", zipCode=" + zipCode + ", phone=" + phone + ", city=" + city + ", country=" + country + ", sid=" + sid + '}';
    }
       
}
