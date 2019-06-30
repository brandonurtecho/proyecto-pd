/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;

import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.router.PathStrategy;
import com.unmsm.patrones.service.facade.impl.UserFacadeService;
import com.unmsm.patrones.service.impl.UserService;
import com.unmsm.patrones.util.Cast;
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
 * @author LaboratorioFISI
 */
public class InitialPath extends PathStrategy{
    
     public InitialPath(String path) {
        super(path);
    }
    
    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.INITIAL);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException {

        String idUser = request.getParameter("iduser");
        String password = request.getParameter("password");
        
         //  String nombre = request.getParameter("nombre");
         //  request.getSession().setAttribute(nombre, nombre);  para mandar a los comentarios

        System.out.println(idUser);
        System.out.println(password);

        UserFacadeService service = new UserFacadeService();
        // WARDA ESTE USER QUE TIENE TODOS LOS DATOS QUE NECESITARÁS
        User user = service.login(idUser, password);
        System.out.println("Apellido: " + user.getLastname());
        
        if (!user.getId().equals("0")) {
            request.getSession().setAttribute("userOn", user);
            RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.INITIAL);
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.INDEX);
            dispatcher.forward(request, response);
        }


        
    }
    
}
