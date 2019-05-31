/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;

import com.unmsm.patrones.model.Person;
import com.unmsm.patrones.router.Path;
import com.unmsm.patrones.util.Jsp;
import com.unmsm.patrones.util.PathName;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.unmsm.patrones.service.IPersonService;
import com.unmsm.patrones.service.impl.StaffService;

/**
 *
 * @author bluq1
 */
public class StaffDetailPath extends Path {

    private IPersonService staffService;

    public StaffDetailPath(String path) {
        super(path);
        staffService = StaffService.getInstance();
    }
    
    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.DETAIL_STAFF);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException {        
        String countryName = request.getParameter("countryName");
        List<Person> customerList = this.staffService.findCustomersByCountryName(countryName);
        request.getSession().setAttribute("listaClientes", customerList);        
        RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.DETAIL);
        dispatcher.forward(request, response);
    }
    
}
