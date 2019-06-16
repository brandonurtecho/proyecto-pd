/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.ParapanamericanoSport;
import com.unmsm.patrones.repository.IParapanamericanoSportRepository;
import com.unmsm.patrones.repository.impl.ParapanamericanoSportDao;
import com.unmsm.patrones.service.IParapanamericanoSportService;
import java.util.List;

/**
 *
 * @author diego
 */
public class ParapanamericanoSportService implements IParapanamericanoSportService {
    private IParapanamericanoSportRepository sportRepository;
    
    public ParapanamericanoSportService() {
        this.sportRepository = new ParapanamericanoSportDao();
    }
    
    @Override
    public List<ParapanamericanoSport> showAllSports() {
        return this.sportRepository.getAll();
    }

    @Override
    public ParapanamericanoSport showSportById(String id) {
        return this.sportRepository.getById(id);
    }
}
