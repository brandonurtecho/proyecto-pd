/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.Event;
import com.unmsm.patrones.repository.IEventRepository;
import com.unmsm.patrones.repository.impl.EventDao;
import com.unmsm.patrones.service.IEventService;
import java.util.List;

/**
 *
 * @author diego
 */
public class EventService implements IEventService {
    private IEventRepository eventRepository;
    
    public EventService() {
        this.eventRepository = new EventDao();
                
    }
    
    @Override
    public List<Event> getAll() {
        return eventRepository.getAll();
    }

    @Override
    public List<Event> getEventsBySport(String sport) {
        return eventRepository.getEventBySport(sport);
    }
    
}
