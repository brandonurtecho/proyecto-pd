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

/**
 *
 * @author bluq1
 */
public class UserFacadeService implements IUserFacadeService {
    
    private ICommentaryService commentaryService;
    private IPaymentService paymentService;
    private IPanamericanoSportService sportService;
    private IUserService userService;

    public UserFacadeService() {
        this.commentaryService = new CommentaryService();
        this.paymentService = new PaymentService() ;
        this.sportService = new PanamericanoSportService();
        this.userService = new UserService();
    }
    
    @Override
    public Boolean login(Session session) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registerNewAccount(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sport> showSportList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sport showSportByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Commentary showCommentaryBySportInSport(String sport) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sportsman showSportsmanBySportInSport(String sport) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean buyTicketForEvent(Payment payment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
