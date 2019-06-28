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
public class ViewProfilePath extends PathStrategy{
    public ViewProfilePath(String path){
        super(path);
    }
    
    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.VIEW_PROFILE);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        AdminFacadeService service = new AdminFacadeService();
        RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/" + Jsp.VIEW_PROFILE);
        dispatcher.forward(request, response);
    }
}
