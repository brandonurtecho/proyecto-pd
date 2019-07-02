/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.facade.impl;

import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.dto.Event;
import com.unmsm.patrones.dto.Payment;
import com.unmsm.patrones.dto.Place;
import com.unmsm.patrones.dto.Sport;
import com.unmsm.patrones.dto.Sportsman;
import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.dto.Volunteer;
import com.unmsm.patrones.service.ICommentaryService;
import com.unmsm.patrones.service.IEventService;
import com.unmsm.patrones.service.IPaymentService;
import com.unmsm.patrones.service.IUserService;
import com.unmsm.patrones.service.facade.IUserFacadeService;
import com.unmsm.patrones.service.impl.CommentaryService;
import com.unmsm.patrones.service.impl.PaymentService;
import com.unmsm.patrones.service.impl.PanamericanoSportService;
import com.unmsm.patrones.service.impl.UserService;
import java.util.List;
import com.unmsm.patrones.service.IPanamericanoSportService;
import com.unmsm.patrones.service.IParapanamericanoSportService;
import com.unmsm.patrones.service.IPlaceService;
import com.unmsm.patrones.service.ISportsmanService;
import com.unmsm.patrones.service.IVolunteerService;
import com.unmsm.patrones.service.impl.EventService;
import com.unmsm.patrones.service.impl.ParapanamericanoSportService;
import com.unmsm.patrones.service.impl.PlaceService;
import com.unmsm.patrones.service.impl.SportsmanService;
import com.unmsm.patrones.service.impl.VolunteerService;
import com.unmsm.patrones.util.TypeSport;
import com.unmsm.patrones.util.iterator.CustomIterator;
import java.util.Arrays;

/**
 *
 * @author bluq1
 */
public class UserFacadeService implements IUserFacadeService {
    
    private ICommentaryService commentaryService;
    private IPaymentService paymentService;
    private IPanamericanoSportService panamericanosportService;
    private IParapanamericanoSportService parapanamericanosportService;
    private IUserService userService;
    private IVolunteerService volunteerService;
    private ISportsmanService sportsmanService;
    private IEventService eventService;
    private IPlaceService placeService;

    public UserFacadeService() {
        this.commentaryService = new CommentaryService();
        this.paymentService = new PaymentService() ;
        this.panamericanosportService = new PanamericanoSportService();
        this.parapanamericanosportService = new ParapanamericanoSportService();
        this.userService = new UserService();
        this.volunteerService = new VolunteerService();
        this.sportsmanService = new SportsmanService();
        this.eventService = new EventService();
        this.placeService = new PlaceService();
    }

    @Override
    public User login(String email, String password) {
        return userService.login(email, password);
    }

    @Override
    public User registerNewAccount(User user) {
        return userService.registerAccount(user);
    }

    @Override
    public Boolean editAccaunt(User user) {
        return userService.editAccount(user);
    }

    @Override
    public List<? extends Sport> showSportList(String type) {
        switch (type) {
            case TypeSport.PANAMERICANO_SPORT : 
                return panamericanosportService.showAllSports();
            case TypeSport.PARAPANAMERICANO_SPORT:
                return parapanamericanosportService.showAllSports();
        }
        return Arrays.asList(Sport.NULL_SPORT);
    }

    @Override
    public Sport showSportById(String id, String type) {
        switch (type) {
            case TypeSport.PANAMERICANO_SPORT :
                return panamericanosportService.showSportById(id);
            case TypeSport.PARAPANAMERICANO_SPORT :
                return parapanamericanosportService.showSportById(id);
        }
        return Sport.NULL_SPORT;
    }

    @Override
    public Boolean commentary(Commentary commentary, String action) {
        switch (action) {
            case "CREATE": return commentaryService.createCommentary(commentary);
            case "LIKE": return commentaryService.likeCommentary(commentary); 
            case "DELETE": return commentaryService.deleteCommentary(commentary); 
        }
        return false;
    }

    @Override
    public CustomIterator showCommentaryBySportInSport(String sport, String sort) {
        return commentaryService.showCommentaryBySport(sport, sort);
    }

    @Override
    public List<Sportsman> showSportsmanBySportInSport(String sport) {
        return sportsmanService.showSportsmansBySport(sport);
    }

    @Override
    public Boolean buyTicketForEvent(Payment payment) {
        paymentService.pay(payment);
        return Boolean.TRUE;
    }

    @Override
    public List<Volunteer> showVolunteers() {
        return volunteerService.showAllVolunteers();
    }

    @Override
    public List<Event> getEvents() {
        return eventService.getAll();
    }

    @Override
    public List<Event> getEvents(String sport) {
        return eventService.getEventsBySport(sport);
    }

    @Override
    public List<Place> getPlaces() {
        return placeService.getAll();
    }

    @Override
    public List<Payment> getPaymentsByEmail(String email) {
        return paymentService.getPaymentsByEmailUser(email);
    }
    
}
