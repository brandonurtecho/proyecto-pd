/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;

import com.unmsm.patrones.dto.Event;
import com.unmsm.patrones.router.PathStrategy;
import com.unmsm.patrones.service.facade.impl.UserFacadeService;
import com.unmsm.patrones.util.Cast;
import com.unmsm.patrones.util.Jsp;
import com.unmsm.patrones.util.PathName;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EventsPath extends PathStrategy {
    
    public EventsPath(String path) {
        super(path);
    }
    
    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.EVENTS);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException {
        
        UserFacadeService service = new UserFacadeService();
        List<Event> list = service.getEvents();
        Cast cast = new Cast();
        request.setAttribute("list", list);
        request.setAttribute("cast", cast);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.EVENTS);
        dispatcher.forward(request, response);
    }
    
}
