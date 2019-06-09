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
import com.unmsm.patrones.dto.Sport;
import com.unmsm.patrones.repository.ISportRepository;
import com.unmsm.patrones.util.TypeCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author diego
 */
public class SportDao implements ISportRepository {

    MongoCollection collection = Connection.getConnection().getCollection(TypeCollections.SPORTS);
    
    @Override
    public List<Sport> getAll() {
        MongoCursor<Document> cursor = collection.find().iterator();
        List<Sport> list = new ArrayList<>();
        
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Sport sport = new Sport.SportBuilder().setId(doc.get("_id").toString())
                                .setHistory(doc.getString("history"))
                                .setOverView(doc.getString("overView"))
                                .setTitle(doc.getString("title")).build();
                
                list.add(sport);
            }
        } finally {
            cursor.close();
        }
        
        return list.size() > 0 ? list : Arrays.asList(Sport.NULL_SPORT);
    }

    @Override
    public Sport getByTitle(String title) {
        Document doc = (Document) collection.find(eq("title", title)).first();
        Sport sport = null;
        
        try {
            sport = new Sport.SportBuilder().setId(doc.get("_id").toString())
                            .setHistory(doc.getString("history"))
                            .setOverView(doc.getString("overView"))
                            .setTitle(doc.getString("title")).build();
        } catch(Exception e) {
            System.out.println(e);
        }
        
        return sport != null ? sport : Sport.NULL_SPORT;
    }
    
}
