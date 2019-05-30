/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.model;

/**
 *
 * @author LaboratorioFISI
 */
public class Country {
    private Integer idCountry;
    private String country;
    private String lastUpdate;

    public Country() {
    }

    public Country(Integer idCountry, String country, String lastUpdate) {
        this.idCountry = idCountry;
        this.country = country;
        this.lastUpdate = lastUpdate;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Country{" + "idCountry=" + idCountry + ", country=" + country + ", lastUpdate=" + lastUpdate + '}';
    }
    
    
}
