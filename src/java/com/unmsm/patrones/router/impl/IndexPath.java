/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;

import com.unmsm.patrones.cache.CacheManagement;
import com.unmsm.patrones.dto.IBuilder;
import com.unmsm.patrones.service.ICountryService;
import com.unmsm.patrones.service.impl.CountryService;
import com.unmsm.patrones.router.PathStrategy;
import com.unmsm.patrones.util.CacheName;
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
        request.getSession().setAttribute("listaPaises", CacheManagement.getInstance().getCache(CacheName.COUNTRY)); 
        RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.INDEX);
        dispatcher.forward(request, response);
    }
    
}
