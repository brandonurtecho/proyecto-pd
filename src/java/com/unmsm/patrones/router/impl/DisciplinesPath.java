/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;


import com.unmsm.patrones.dto.PanamericanoSport;
import com.unmsm.patrones.dto.ParapanamericanoSport;
import com.unmsm.patrones.dto.Sport;
import com.unmsm.patrones.router.PathStrategy;
import com.unmsm.patrones.service.facade.impl.UserFacadeService;
import com.unmsm.patrones.util.Jsp;
import com.unmsm.patrones.util.PathName;
import com.unmsm.patrones.util.TypeSport;
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
public class DisciplinesPath extends PathStrategy{
    
    
    public DisciplinesPath(String path) {
        super(path);
    }
    
    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.DISCIPLINES);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException {
        
        UserFacadeService service = new UserFacadeService();
        
        int num = Integer.parseInt(request.getParameter("num"));
        if (num == 0){
           List<PanamericanoSport> list = (List<PanamericanoSport>) service.showSportList(TypeSport.PANAMERICANO_SPORT);
           request.setAttribute("list", list);
        }else {
           List<ParapanamericanoSport> list = (List<ParapanamericanoSport>) service.showSportList(TypeSport.PARAPANAMERICANO_SPORT);
           request.setAttribute("list", list);
        
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.DISCIPLINES);
        dispatcher.forward(request, response);
    }
}
