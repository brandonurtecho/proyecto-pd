/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.controller;

import javax.servlet.annotation.WebServlet;

@WebServlet({"/",""})
public class CustomerController extends GenericController {

    @Override
    public String getServletInfo() {
        return "Servlet Customer Controller, ruta base: /";
    }
    
}
