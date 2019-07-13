/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;

import com.unmsm.patrones.dto.Admin;
import com.unmsm.patrones.router.PathStrategy;
import com.unmsm.patrones.service.facade.impl.AdminFacadeService;
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
 * @author TASSO-PC
 */
public class EditProfilePath extends PathStrategy{
    public EditProfilePath(String path){
        super(path);
    }
    
    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.EDIT_PROFILE);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        AdminFacadeService service = new AdminFacadeService();
        
        String email = request.getParameter("email");
        String password = (String) request.getSession().getAttribute("adminPass");
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        String dni = request.getParameter("dni");
        String phone = request.getParameter("phone");
        String age = request.getParameter("age");
        String genre = request.getParameter("genre");
        
        Admin admin = new Admin.AdminBuilder().setEmail(email).setPassword(password)
                                              .setName(name).setLastname(lastname)
                                              .setDni(dni).setPhone(phone)
                                              .setAge(age).setGenre(genre).build();     
        
        if(service.editAccount(admin)){
            request.getSession().setAttribute("admin", admin);
            RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.VIEW_PROFILE);
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.EDIT_PROFILE);
            dispatcher.forward(request, response);
        }
        
        
    }
}
