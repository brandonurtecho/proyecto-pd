/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.servlet;

import com.unmsm.patrones.config.PathConfigSingleton;
import com.unmsm.patrones.router.PathStrategy;
import com.unmsm.patrones.util.PathName;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class GenericServlet extends HttpServlet {
   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String path = request.getPathInfo();
            router(request, response, path);            
        } catch (SQLException ex) {
            Logger.getLogger(GenericServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {           
        doGet(request, response);        
    }
    
    private void router(HttpServletRequest request, HttpServletResponse response, String path) 
            throws ServletException, IOException, SQLException {
        PathConfigSingleton pcs = PathConfigSingleton.getInstance();
        for (PathStrategy p : pcs.getListPath()) {
            if(p.isMatch(path)){
                p.operate(request, response);
                return;
            }
        }        
        defaultReturn(request, response);
    }
    
    private void defaultReturn(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(PathName.DEFAULT);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException ex) {
            Logger.getLogger(GenericServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // </editor-fold>
}
