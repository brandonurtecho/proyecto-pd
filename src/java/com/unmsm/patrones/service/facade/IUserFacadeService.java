/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.facade;

import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.dto.Payment;
import com.unmsm.patrones.dto.Session;
import com.unmsm.patrones.dto.Sport;
import com.unmsm.patrones.dto.Sportsman;
import com.unmsm.patrones.dto.User;
import java.util.List;

/**
 *
 * @author bluq1
 */
public interface IUserFacadeService {    
    //Esto esperará
    Boolean login(String email, String password);
    Boolean registerNewAccount(User user);
    Boolean editAccaunt(User user);
    /*****************/
    List<Sport> showSportList(String type);
    Sport showSportById(String id, String type);
    Boolean commentary(Commentary commentary, String action);
    List<Commentary> showCommentaryBySportInSport(String sport);
    Sportsman showSportsmanBySportInSport(String sport);
    Boolean buyTicketForEvent(Payment payment);
}
