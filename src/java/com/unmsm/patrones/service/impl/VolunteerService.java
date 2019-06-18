/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.Volunteer;
import com.unmsm.patrones.repository.IVolunteerRepository;
import com.unmsm.patrones.repository.impl.VolunteerDao;
import com.unmsm.patrones.service.IVolunteerService;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class VolunteerService implements IVolunteerService{
    private IVolunteerRepository volunteerRepository;
    
    public VolunteerService() {
        this.volunteerRepository = new VolunteerDao();
    }
    
    @Override
    public List<Volunteer> showAllVolunteers() {
        return volunteerRepository.getAll();
    }
    
}
