/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.Sportsman;
import com.unmsm.patrones.repository.ISportsmanRepository;
import com.unmsm.patrones.repository.impl.SportsmanDao;
import com.unmsm.patrones.service.ISportsmanService;
import java.util.List;

/**
 *
 * @author diego
 */
public class SportsmanService implements ISportsmanService {

    private ISportsmanRepository sportsmanRepository;
    
    public SportsmanService() {
        this.sportsmanRepository = new SportsmanDao();
    }
    
    @Override
    public List<Sportsman> showSportsmansBySport(String sport) {
        return sportsmanRepository.getSportsmanBySport(sport);
    }
    
}
