/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.facade.impl;

import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.dto.Payment;
import com.unmsm.patrones.dto.Session;
import com.unmsm.patrones.dto.Sport;
import com.unmsm.patrones.dto.Sportsman;
import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.service.ICommentaryService;
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
import com.unmsm.patrones.service.impl.ParapanamericanoSportService;
import com.unmsm.patrones.util.TypeSport;
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

    public UserFacadeService() {
        this.commentaryService = new CommentaryService();
        this.paymentService = new PaymentService() ;
        this.panamericanosportService = new PanamericanoSportService();
        this.parapanamericanosportService = new ParapanamericanoSportService();
        this.userService = new UserService();
    }

    @Override
    public Boolean login(String email, String password) {
        return userService.login(email, password);
    }

    @Override
    public Boolean registerNewAccount(User user) {
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
    public List<Commentary> showCommentaryBySportInSport(String sport) {
        return commentaryService.showCommentaryBySport(sport);
    }

    @Override
    public Sportsman showSportsmanBySportInSport(String sport) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean buyTicketForEvent(Payment payment) {
        paymentService.sendPaymentEmail(payment);
        return Boolean.TRUE;
    }
    
}
