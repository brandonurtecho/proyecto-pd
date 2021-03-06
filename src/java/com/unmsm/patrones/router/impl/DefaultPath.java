/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;


//import com.unmsm.patrones.service.impl.CountryService;
import com.unmsm.patrones.router.PathStrategy;
import com.unmsm.patrones.util.Jsp;
import com.unmsm.patrones.util.PathName;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bluq1
 */
public class DefaultPath extends PathStrategy  {
    
    public DefaultPath(String path) {
        super(path);
        //countryService = new CountryService();
    }
    
    @Override
    public Boolean isMatch(String path) {
        return (path == null || path.equals(PathName.DEFAULT));
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException {
       
        RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.INDEX);
        dispatcher.forward(request, response);
    }
    
}
