/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository.impl;

import com.unmsm.patrones.connection.ConnectionSingleton;
import com.unmsm.patrones.dto.Staff;
import com.unmsm.patrones.repository.IStaffReadeable;
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
public class StaffDao implements IStaffReadeable {
        
    private final static String SELECT_BY_COUNTRY_NAME = "select * from staff_list where staff_list.country =?;";

    public StaffDao() {}
            
    /**
     *
     * @param nameParam
     * @return
     */
    @Override
    public List<Staff> findByCountryName(String nameParam) {
        List<Staff> listStaff = new ArrayList<>();        
        ConnectionSingleton connection = ConnectionSingleton.getInstance();
        try (PreparedStatement preparedStatement = 
                connection.getConn().prepareStatement(SELECT_BY_COUNTRY_NAME);) {
            
            preparedStatement.setString(1, nameParam);  
            System.out.println(preparedStatement);            
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Staff staff = new Staff();
                staff.setId(rs.getInt("ID"));
                staff.setName(rs.getString("name"));
                staff.setAddress(rs.getString("address"));
                staff.setZipCode(rs.getString("zip code"));
                staff.setPhone(rs.getString("phone"));
                staff.setCity(rs.getString("city"));
                staff.setCountry(rs.getString("country"));
                staff.setSid(rs.getBoolean("SID"));
                listStaff.add(staff);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CountryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listStaff.size() > 0 ? listStaff : Arrays.asList(Staff.NULL_STAFF);
    }
}
