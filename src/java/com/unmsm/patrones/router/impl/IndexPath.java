/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;

import com.unmsm.patrones.cache.CacheManagement;
import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.dto.factory.PersonFactory;
import com.unmsm.patrones.router.PathStrategy;
import com.unmsm.patrones.service.facade.impl.UserFacadeService;
import com.unmsm.patrones.service.impl.UserService;
import com.unmsm.patrones.util.CacheName;
import com.unmsm.patrones.util.Cast;
import com.unmsm.patrones.util.Jsp;
import com.unmsm.patrones.util.PathName;
import com.unmsm.patrones.util.TypePerson;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bluq1
 */
public class IndexPath extends PathStrategy {

    public IndexPath(String path) {
        super(path);
    }
    
    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.INDEX);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException {
        
       
        PersonFactory<User> personFactory = new PersonFactory<>();
        User user = personFactory.getPerson(TypePerson.USER);
     
        UserFacadeService service = new UserFacadeService();
        
        try {
            user.setEmail(request.getParameter("email"));
            user.setPassword(request.getParameter("password"));
            user.setGenre(request.getParameter("genero"));
            user.setName(request.getParameter("nombre"));
            user.setLastname(request.getParameter("apellido"));
            user.setBirthdate(Cast.stringToDate(request.getParameter("date")));
        } catch (ParseException ex) {
           Logger.getLogger(IndexPath.class.getName()).log(Level.SEVERE, null, ex);
        }

        service.registerNewAccount(user);
        request.getSession().setAttribute("userOn", user);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.INITIAL);
        dispatcher.forward(request, response);

    }

}
