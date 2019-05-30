/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;

import com.unmsm.patrones.model.Customer;
import com.unmsm.patrones.model.Person;
import com.unmsm.patrones.service.impl.CustomerService;
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

/**
 *
 * @author bluq1
 */
public class CustomerDetailPath extends Path {

    private IPersonService customerService = new CustomerService();

    public CustomerDetailPath(String path) {
        super(path);
    }
    
    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.DETAIL_CUSTOMER);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException {        
        String countryName = request.getParameter("countryName");
        List<Person> customerList = this.customerService.findCustomersByCountryName(countryName);
        request.getSession().setAttribute("listaClientes", customerList);        
        RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.DETAIL);
        dispatcher.forward(request, response);
    }
    
}
