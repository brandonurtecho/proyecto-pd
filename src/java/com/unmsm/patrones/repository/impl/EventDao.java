/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository.impl;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.eq;
import com.unmsm.patrones.connection.Connection;
import com.unmsm.patrones.dto.Event;
import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.repository.IEventRepository;
import com.unmsm.patrones.util.Cast;
import com.unmsm.patrones.util.TypeCollections;
import com.unmsm.patrones.util.TypePerson;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author diego
 */
public class EventDao implements IEventRepository {
    MongoCollection collection = 
            Connection.getConnection().getCollection(TypeCollections.EVENTS);
    
    @Override
    public List<Event> getAll() {
        MongoCursor<Document> cursor = collection.find().iterator();
        List<Event> list = new ArrayList<>();
        
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Event event = new Event.EventBuilder()
                        .setId(doc.get("_id").toString())
                        .setSport(doc.getString("sport"))
                        .setDate(Cast.stringToDate(doc.getString("date")))
                        .setPlace(doc.getString("place"))
                        .build();
                
                list.add(event);
            }
        } catch (ParseException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cursor.close();
        }
        
        return list.size() > 0 ? list :Arrays.asList(Event.NULL_EVENT);
    }

    @Override
    public List<Event> getEventBySport(String sport) {
        MongoCursor<Document> cursor = collection.find(eq("sport", sport)).iterator();
        List<Event> list = new ArrayList<>();
        
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Event event = new Event.EventBuilder()
                        .setId(doc.get("_id").toString())
                        .setSport(doc.getString("sport"))
                        .setDate(Cast.stringToDate(doc.getString("date")))
                        .setPlace(doc.getString("place"))
                        .build();
                
                list.add(event);
            }
        } catch (ParseException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cursor.close();
        }
        
        return list.size() > 0 ? list :Arrays.asList(Event.NULL_EVENT);
    }
    
}
