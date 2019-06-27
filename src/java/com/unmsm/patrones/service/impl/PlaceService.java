/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.Place;
import com.unmsm.patrones.repository.IPlaceRepository;
import com.unmsm.patrones.repository.impl.PlaceDao;
import com.unmsm.patrones.service.IPlaceService;
import java.util.List;

/**
 *
 * @author diego
 */
public class PlaceService implements IPlaceService {
    private IPlaceRepository placeRepository;

    public PlaceService() {
        this.placeRepository = new PlaceDao();
    }
    
    @Override
    public List<Place> getAll() {
        return placeRepository.getAll();
    }
    
}
