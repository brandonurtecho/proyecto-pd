/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository;

import com.unmsm.patrones.dto.PanamericanoSport;
import com.unmsm.patrones.dto.Sport;
import java.util.List;

/**
 *
 * @author diego
 */
public interface IPanamericanoSportReadeable{
    List<PanamericanoSport> getAll();
    PanamericanoSport getById(String id);
}
