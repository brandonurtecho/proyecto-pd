/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository.impl;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.unmsm.patrones.connection.Connection;
import com.unmsm.patrones.dto.Volunteer;
import com.unmsm.patrones.dto.factory.PersonFactory;
import com.unmsm.patrones.repository.IVolunteerRepository;
import com.unmsm.patrones.util.TypeCollections;
import com.unmsm.patrones.util.TypePerson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author diego
 */
public class VolunteerDao implements IVolunteerRepository {

    MongoCollection collection = 
            Connection.getConnection().getCollection(TypeCollections.VOLUNTEERS);
    PersonFactory<Volunteer> volunteerFactory = new PersonFactory<>();
    
    @Override
    public List<Volunteer> getAll() {
        MongoCursor<Document> cursor = collection.find().iterator();
        List<Volunteer> list = new ArrayList<>();
        
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Volunteer volunteer = volunteerFactory.getPerson(TypePerson.VOLUNTEER);
                
                volunteer.setId(doc.get("_id").toString());
                volunteer.setName(doc.getString("name"));
                volunteer.setLastname(doc.getString("lastname"));
                volunteer.setJob(doc.getString("job"));
                volunteer.setPhoto(doc.getString("photo"));
                volunteer.setPlace(doc.getString("place"));
                
                list.add(volunteer);
            }
        }  finally {
            cursor.close();
        }
        
        return list.size() > 0 ? list : Arrays.asList(Volunteer.NULL_VOLUNTEER);

    }
    
}
