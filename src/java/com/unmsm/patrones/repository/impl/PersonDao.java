/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository.impl;

import com.unmsm.patrones.connection.ConnectionSingleton;
import com.unmsm.patrones.model.Person;
import com.unmsm.patrones.model.factory.PersonFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.unmsm.patrones.repository.IPersonReadeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bluq1
 */
public abstract class PersonDao implements IPersonReadeable {
            
    private String SELECT_BY_COUNTRY_NAME;
    private String type;    
    
    public PersonDao(String select, String type) {
        SELECT_BY_COUNTRY_NAME = select;
        this.type = type;
    }
        
    @Override
    public List<Person> findByCountryName(String nameParam) {
        List<Person> listPerson = new ArrayList<>();        
        ConnectionSingleton connection = ConnectionSingleton.getInstance();
        PersonFactory factory = new PersonFactory();
        try (PreparedStatement preparedStatement = 
                connection.getConn().prepareStatement(SELECT_BY_COUNTRY_NAME);) {
            
            preparedStatement.setString(1, nameParam);  
            System.out.println(preparedStatement);            
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Person person = factory.getPerson(type);      
                person.setId(rs.getInt("ID"));
                person.setName(rs.getString("name"));
                person.setAddress(rs.getString("address"));
                person.setZipCode(rs.getString("zip code"));
                person.setPhone(rs.getString("phone"));
                person.setCity(rs.getString("city"));
                person.setCountry(rs.getString("country"));
                person.setSid(rs.getBoolean("SID"));
                listPerson.add(person);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CountryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listPerson;
    }
}
