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
import com.unmsm.patrones.dto.Volunteer;
import com.unmsm.patrones.service.IAdminService;
import com.unmsm.patrones.service.ICommentaryService;
import com.unmsm.patrones.service.IPaymentService;
import com.unmsm.patrones.service.IVolunteerService;
import com.unmsm.patrones.service.facade.IAdminFacadeService;
import com.unmsm.patrones.service.impl.AdminService;
import com.unmsm.patrones.service.impl.CommentaryService;
import com.unmsm.patrones.service.impl.PaymentService;
import com.unmsm.patrones.service.impl.VolunteerService;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class AdminFacadeService implements IAdminFacadeService{
    
    private IAdminService adminService;
    private ICommentaryService commentaryService;
    private IVolunteerService volunteerService;
    private IPaymentService paymentService;

    public AdminFacadeService() {
        this.adminService = new AdminService();
        this.commentaryService = new CommentaryService();
        this.volunteerService = new VolunteerService();
        this.paymentService = new PaymentService();
    }
    
    @Override
    public Boolean login(String email, String password) {
        return adminService.login(email, password);
    }

    @Override
    public Person showProfileAdmin(Admin admin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Commentary> showCommentarySport(String sport) {
        return commentaryService.showCommentaryBySport(sport);
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
    
}
