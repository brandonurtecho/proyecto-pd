/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository.impl;

import com.unmsm.patrones.connection.ConnectionSingleton;
import com.unmsm.patrones.dto.Customer;
import com.unmsm.patrones.repository.ICustomerReadeable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bluq1
 */
public class CustomerDao implements ICustomerReadeable{
    
    private final static String SELECT_BY_COUNTRY_NAME = "select * from customer_list where customer_list.country =?;";

    public CustomerDao() {}
            
    /**
     *
     * @param nameParam
     * @return
     */
    @Override
    public List<Customer> findByCountryName(String nameParam) {
        List<Customer> listCustomer = new ArrayList<>();        
        ConnectionSingleton connection = ConnectionSingleton.getInstance();
        try (PreparedStatement preparedStatement = 
                connection.getConn().prepareStatement(SELECT_BY_COUNTRY_NAME);) {
            
            preparedStatement.setString(1, nameParam);  
            System.out.println(preparedStatement);            
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getInt("ID"));
                customer.setName(rs.getString("name"));
                customer.setAddress(rs.getString("address"));
                customer.setZipCode(rs.getString("zip code"));
                customer.setPhone(rs.getString("phone"));
                customer.setCity(rs.getString("city"));
                customer.setCountry(rs.getString("country"));
                customer.setSid(rs.getBoolean("SID"));
                listCustomer.add(customer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CountryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listCustomer.size() > 0 ? listCustomer : Arrays.asList(Customer.NULL_CUSTOMER);
    }
}
