/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.facade.impl;

import com.unmsm.patrones.dto.Admin;
import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.dto.Payment;
import com.unmsm.patrones.dto.Person;
import com.unmsm.patrones.dto.Sport;
import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.dto.Volunteer;
import com.unmsm.patrones.service.IAdminService;
import com.unmsm.patrones.service.ICommentaryService;
import com.unmsm.patrones.service.IPanamericanoSportService;
import com.unmsm.patrones.service.IParapanamericanoSportService;
import com.unmsm.patrones.service.IPaymentService;
import com.unmsm.patrones.service.IUserService;
import com.unmsm.patrones.service.IVolunteerService;
import com.unmsm.patrones.service.facade.IAdminFacadeService;
import com.unmsm.patrones.service.impl.AdminService;
import com.unmsm.patrones.service.impl.CommentaryService;
import com.unmsm.patrones.service.impl.PaymentService;
import com.unmsm.patrones.service.impl.UserService;
import com.unmsm.patrones.service.impl.VolunteerService;
import com.unmsm.patrones.util.TypeSport;
import com.unmsm.patrones.util.iterator.CustomIterator;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class AdminFacadeService implements IAdminFacadeService{
    
    private IAdminService adminService;
    private IUserService userService;
    private ICommentaryService commentaryService;
    private IVolunteerService volunteerService;
    private IPaymentService paymentService;
    private IPanamericanoSportService panamericanosportService;
    private IParapanamericanoSportService parapanamericanosportService;
    
    

    public AdminFacadeService() {
        this.adminService = new AdminService();
        this.userService = new UserService();
        this.commentaryService = new CommentaryService();
        this.volunteerService = new VolunteerService();
        this.paymentService = new PaymentService();
    }
    
    @Override
    public Boolean login(String email, String password) {
        return adminService.login(email, password);
    }

    @Override
    public Admin showProfileAdminByEmail(String email) {
        return adminService.getProfileByEmail(email);
    }

    @Override
    public CustomIterator showCommentarySport(String sport, String sort) {
        return commentaryService.showCommentaryBySport(sport, sort);
    }
    
    @Override
    public List<User> showAttendees() {
        return userService.getAllUsers();
    }

    @Override
    public List<Volunteer> showVolunteers() {
        return volunteerService.showAllVolunteers();
    }

    @Override
    public Boolean logout() {
        return Boolean.TRUE;
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentService.getAll();
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
    public Boolean editAccount(Admin admin) {
        return adminService.editAccount(admin);
    }
    
}
