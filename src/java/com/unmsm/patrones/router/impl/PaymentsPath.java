/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;

import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.dto.Event;
import com.unmsm.patrones.dto.Payment;
import com.unmsm.patrones.router.PathStrategy;
import com.unmsm.patrones.service.facade.impl.UserFacadeService;
import com.unmsm.patrones.util.Cast;
import com.unmsm.patrones.util.Jsp;
import com.unmsm.patrones.util.PathName;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class PaymentsPath extends PathStrategy {
    
    public PaymentsPath(String path) {
        super(path);
    }
    
    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.PAYMENTS);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException {
        
        UserFacadeService service = new UserFacadeService();
        
        if(request.getParameter("payEvent")==null){
            request.getSession().setAttribute("id", request.getParameter("id"));     
            request.getSession().setAttribute("date", request.getParameter("date"));
            request.getSession().setAttribute("sport", request.getParameter("sport"));
            request.getSession().setAttribute("place", request.getParameter("place"));
            RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.PAYMENTS);
            dispatcher.forward(request, response);
        } else{
            List<Event> list = new ArrayList<>();
            String id = (String) request.getSession().getAttribute("id");     
            String date = (String) request.getSession().getAttribute("date");
            String sport = (String) request.getSession().getAttribute("sport");
            String place = (String) request.getSession().getAttribute("place");
            try {
                list.add(new Event(id, Cast.stringToDate(date),sport,place));
            } catch (ParseException ex) {
                Logger.getLogger(PaymentsPath.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Payment pay = new Payment.PaymentBuilder()
                    .setFirstName(request.getParameter("firstname"))
                    .setLastName(request.getParameter("lastname"))
                    .setEmail(request.getParameter("email"))
                    .setAddress(request.getParameter("address"))
                    .setOptionalAddress(request.getParameter("address2"))
                    .setCountry(request.getParameter("country"))
                    .setState(request.getParameter("state"))
                    .setZipCode(request.getParameter("zip"))
                    .setEventList(list)
                    .setNumberCard(request.getParameter("creditcard"))
                    .setPaypal(request.getParameter("paypal"))
                    .build();

            service.buyTicketForEvent(pay);
            RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.EVENTS);
            dispatcher.forward(request, response);
        }
        
    }
    
    
}
