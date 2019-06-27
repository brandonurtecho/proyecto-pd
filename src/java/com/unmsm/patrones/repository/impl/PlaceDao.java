/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository.impl;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.unmsm.patrones.connection.Connection;
import com.unmsm.patrones.dto.Place;
import com.unmsm.patrones.repository.IPlaceRepository;
import com.unmsm.patrones.util.TypeCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author diego
 */
public class PlaceDao implements IPlaceRepository {

    MongoCollection collection = 
            Connection.getConnection().getCollection(TypeCollections.PLACES);
    
    @Override
    public List<Place> getAll() {
        MongoCursor<Document> cursor = collection.find().iterator();
        List<Place> list = new ArrayList<>();
        
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Place place = new Place.PlaceBuilder()
                        .setId(doc.get("_id").toString())
                        .setDescription(doc.getString("description"))
                        .setName(doc.getString("name"))
                        .setVenues((List<String>)doc.get("venues"))
                        .build();
                
                list.add(place);
            }
        } finally {
            cursor.close();
        }
        
        return list.size() > 0 ? list :Arrays.asList(Place.NULL_PLACE);
    }
    
}
