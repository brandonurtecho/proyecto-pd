/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.facade;

import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.dto.Event;
import com.unmsm.patrones.dto.Payment;
import com.unmsm.patrones.dto.Place;
import com.unmsm.patrones.dto.Sport;
import com.unmsm.patrones.dto.Sportsman;
import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.dto.Volunteer;
import com.unmsm.patrones.util.iterator.CustomIterator;
import java.util.List;

/**
 *
 * @author bluq1
 */
public interface IUserFacadeService {    
    //Esto esperará
    User login(String email, String password);
    User registerNewAccount(User user);
    Boolean editAccaunt(User user);
    List<? extends Sport> showSportList(String type);
    Sport showSportById(String id, String type);
    Boolean commentary(Commentary commentary, String action);
    CustomIterator showCommentaryBySportInSport(String sport, String sort);
    List<Sportsman> showSportsmanBySportInSport(String sport);
    List<Volunteer> showVolunteers();
    Boolean buyTicketForEvent(Payment payment);
    List<Payment> getPaymentsByEmail(String email);
    List<Event> getEvents();
    List<Event> getEvents(String sport);
    List<Place> getPlaces();
}
