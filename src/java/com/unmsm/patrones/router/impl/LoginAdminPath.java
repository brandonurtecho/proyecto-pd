/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;

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
public class LoginAdminPath extends PathStrategy{

    public LoginAdminPath(String path) {
        super(path);
    }
    
    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.LOGIN_ADMIN);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        AdminFacadeService service = new AdminFacadeService();
        
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        request.getSession().setAttribute("adminEmail", user);
        request.getSession().setAttribute("adminPass", pass);
        if(service.login(user, pass)){
            response.sendRedirect("/proyecto/admin-file/main-content.jsp");
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/" +Jsp.MAIN_CONTENT);
//            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("/proyecto/admin-file/login-admin.jsp");
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/" + Jsp.LOGIN_ADMIN);
//            dispatcher.forward(request, response);
        }
           
    }
    
}
