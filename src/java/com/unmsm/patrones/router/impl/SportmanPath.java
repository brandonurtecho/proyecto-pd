/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;

import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.dto.Sportsman;
import com.unmsm.patrones.router.PathStrategy;
import com.unmsm.patrones.service.facade.impl.UserFacadeService;
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
 * @author LaboratorioFISI
 */
public class SportmanPath extends PathStrategy{
    
    public SportmanPath(String path) {
        super(path);
    }
    
    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.SPORTMAN);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException {
        
        UserFacadeService service = new UserFacadeService();
        
        String sport = request.getParameter("sport");
        
        if (sport != null){
            List <Sportsman> sportlist = service.showSportsmanBySportInSport(sport);
            List <Commentary> commentarylist = service.showCommentaryBySportInSport(sport);
            request.setAttribute("spórts", sportlist);
            request.setAttribute("commentarys", commentarylist);
        }
        
        
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.SPORTMAN);
        dispatcher.forward(request, response);
    }
    
}
