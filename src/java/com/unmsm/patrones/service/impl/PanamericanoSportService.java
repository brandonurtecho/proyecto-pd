/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.PanamericanoSport;
import com.unmsm.patrones.repository.impl.PanamericanoSportDao;
import java.util.List;
import com.unmsm.patrones.repository.IPanamericanoSportRepository;
import com.unmsm.patrones.service.IPanamericanoSportService;

/**
 *
 * @author bluq1
 */
public class PanamericanoSportService implements IPanamericanoSportService {
    
    private IPanamericanoSportRepository sportRepository;
    
    public PanamericanoSportService() {
        this.sportRepository = new PanamericanoSportDao();
    }
    
    @Override
    public List<PanamericanoSport> showAllSports() {
        return this.sportRepository.getAll();
    }

    @Override
    public PanamericanoSport showSportById(String id) {
        return this.sportRepository.getById(id);
    }
    
}
