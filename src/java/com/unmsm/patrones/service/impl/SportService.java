/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.Sport;
import com.unmsm.patrones.repository.ISportRepository;
import com.unmsm.patrones.repository.impl.SportDao;
import com.unmsm.patrones.service.ISportService;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class SportService implements ISportService {
    
    private ISportRepository sportRepository;
    
    public SportService() {
        this.sportRepository = new SportDao();
    }
    
    @Override
    public List<Sport> showAllSports() {
        return this.sportRepository.getAll();
    }

    @Override
    public Sport showSportBySport(String sport) {
        return this.sportRepository.getByTitle(sport);
    }
    
}
