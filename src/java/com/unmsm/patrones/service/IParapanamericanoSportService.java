/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service;

import com.unmsm.patrones.dto.PanamericanoSport;
import com.unmsm.patrones.dto.ParapanamericanoSport;
import java.util.List;

/**
 *
 * @author diego
 */
public interface IParapanamericanoSportService {
    List<ParapanamericanoSport> showAllSports();
    ParapanamericanoSport showSportById(String id);
}
