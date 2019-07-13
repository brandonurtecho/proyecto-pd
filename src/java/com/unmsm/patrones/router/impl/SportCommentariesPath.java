/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;

import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.router.PathStrategy;
import com.unmsm.patrones.service.facade.impl.AdminFacadeService;
import com.unmsm.patrones.util.Cast;
import com.unmsm.patrones.util.Jsp;
import com.unmsm.patrones.util.PathName;
import com.unmsm.patrones.util.iterator.CustomIterator;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TASSO-PC
 */
public class SportCommentariesPath extends PathStrategy{
    public SportCommentariesPath(String path){
        super(path);
    }
    
    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.SPORT_COMMENTARIES);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        AdminFacadeService service = new AdminFacadeService();
        
        String sport = request.getParameter("sport");
        CustomIterator comments = service.showCommentarySport(sport, "LIKE");
        request.setAttribute("comments", comments);
        request.setAttribute("cast", new Cast());
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.SPORT_COMMENTARIES);
        dispatcher.forward(request, response);
    }
}
