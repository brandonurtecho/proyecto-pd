/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.connection;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bluq1
 */
public class ConnectionSingleton {
    
    private static ConnectionSingleton instance;
    
    private static final String jdbcURL = "jdbc:mysql://localhost:3306/sakila";
    private static final String jdbcUsername = "root";
    private static final String jdbcPassword = "";
    private Connection conn;

    private ConnectionSingleton() {
        connect();
    }
    
    private Connection connect(){
        if(conn == null){
            try {
                DriverManager.registerDriver(new Driver());
                conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword );
            } catch (SQLException e) {
                System.out.println(
                        "Error al registrar el controlador"
                        + e.getMessage());
            }
        }
        return conn;
    }
    
    public final static ConnectionSingleton getInstance(){
        if(instance == null){
            instance = new ConnectionSingleton();            
        }
        return instance;
    } 

    public Connection getConn() {
        return conn;
    }    
}

