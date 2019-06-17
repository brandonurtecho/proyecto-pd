/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bluq1
 */
public abstract class PathStrategy {
    
    private String path;

    public PathStrategy(String path) {
        this.path = path;
    }
    
    public abstract Boolean isMatch(String path);  
    
    public abstract void operation(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException;
    
    public void operate(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException{
        System.out.println("Ruta " + path + " ejecutada");
        operation(request, response);
    }
}
