/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;

//import com.unmsm.patrones.dto.Customer;
import com.unmsm.patrones.router.PathStrategy;
//import com.unmsm.patrones.service.ICustomerService;
//import com.unmsm.patrones.service.impl.CustomerService;
import com.unmsm.patrones.util.Jsp;
import com.unmsm.patrones.util.PathName;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bluq1
 */
public class CustomerDetailPath extends PathStrategy {

    //private ICustomerService customerService;

    public CustomerDetailPath(String path) {
        super(path);
        //customerService = new CustomerService();
    }
    
    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.DETAIL_CUSTOMER);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException {        
        String countryName = request.getParameter("countryName");
        //List<Customer> customerList = customerService.findCustomersByCountryName(countryName);
        //request.getSession().setAttribute("listaClientes", customerList);        
        RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.DETAIL);
        dispatcher.forward(request, response);
    }
    
}
