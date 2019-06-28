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
import com.unmsm.patrones.dto.Sportsman;
import com.unmsm.patrones.dto.factory.PersonFactory;
import com.unmsm.patrones.repository.ISportsmanRepository;
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
public class SportsmanDao implements ISportsmanRepository {

    MongoCollection collection = 
            Connection.getConnection().getCollection(TypeCollections.SPORTSMANS);
    PersonFactory<Sportsman> personFactory = new PersonFactory<>();
    
    @Override
    public List<Sportsman> getSportsmanBySport(String sport) {
        MongoCursor<Document> cursor = collection.find(eq("sport", sport)).iterator();
        List<Sportsman> list = new ArrayList<>();
        
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Sportsman sportsman = personFactory.getPerson(TypePerson.SPORTSMAN);
                
                sportsman.setId(doc.get("_id").toString());
                sportsman.setGenre(doc.getString("genre"));
                sportsman.setName(doc.getString("name"));
                sportsman.setLastname(doc.getString("lastname"));
                sportsman.setBirthdate(Cast.stringToDate(doc.getString("birthdate")));
                sportsman.setAge(doc.getInteger("age"));
                sportsman.setCountry(doc.getString("country"));
                sportsman.setPhoto(doc.getString("photo"));
                sportsman.setSport(doc.getString("sport"));
                sportsman.setMedalList((List<String>) doc.get("medalList"));
                
                list.add(sportsman);
            }
        } catch (ParseException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cursor.close();
        }
        
        return list.size() > 0 ? list :Arrays.asList(Sportsman.NULL_SPORTSMAN);

    }
    
}
