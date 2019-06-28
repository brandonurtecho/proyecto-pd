/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.facade;

import com.unmsm.patrones.dto.Admin;
import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.dto.Payment;
import com.unmsm.patrones.dto.Person;
import com.unmsm.patrones.dto.Sport;
import com.unmsm.patrones.dto.Volunteer;
import java.util.List;

/**
 *
 * @author bluq1
 */
public interface IAdminFacadeService {
    Boolean login(String email, String password);
    Person showProfileAdmin(Admin admin);
    //falta lo de las sedes
    List<Commentary> showCommentarySport(String sport);
    List<Volunteer> showVolunteers();
    List<Payment> getAllPayments();
    List<? extends Sport> showSportList(String type);
    Boolean logout();
}
