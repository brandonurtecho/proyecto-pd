/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository.impl;

import com.unmsm.patrones.connection.ConnectionSingleton;
import com.unmsm.patrones.repository.ICountryReadeable;
import com.unmsm.patrones.dto.Country;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bluq1
 */
public class CountryDao implements ICountryReadeable{

    private static final String SELECT_ALL = "select * from country;";

    public CountryDao() {
    }

    @Override
    public List<Country> selectAll() {
        List<Country> listaCountry = new ArrayList<>();
        ConnectionSingleton connection = ConnectionSingleton.getInstance();
        try (
            PreparedStatement preparedStatement = 
                    connection.getConn().prepareStatement(SELECT_ALL);) {
            
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Country country = new Country.ContryBuilder()
                        .setIdCountry(rs.getInt("country_id"))
                        .setCountry(rs.getString("country"))
                        .setLastUpdate(rs.getString("last_update"))
                        .build();
                listaCountry.add(country);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CountryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaCountry;
    }
   
}
