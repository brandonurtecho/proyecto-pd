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
import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.dto.Volunteer;
import com.unmsm.patrones.util.iterator.CustomIterator;
import java.util.List;

/**
 *
 * @author bluq1
 */
public interface IAdminFacadeService {
    Boolean login(String email, String password);
    Admin showProfileAdminByEmail(String email);
    Boolean editAccount(Admin admin);
    //falta lo de las sedes
    CustomIterator showCommentarySport(String sport, String sort);
    List<User> showAttendees();
    List<Volunteer> showVolunteers();
    List<Payment> getAllPayments();
    List<? extends Sport> showSportList(String type);
    Boolean logout();
}
