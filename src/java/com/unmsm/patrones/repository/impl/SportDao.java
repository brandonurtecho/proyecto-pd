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
                Sport sport = new Sport();
                
                sport.setId(doc.get("_id").toString());
                sport.setHistory(doc.getString("history"));
                sport.setOverView(doc.getString("overView"));
                sport.setTitle(doc.getString("title"));
                
                list.add(sport);
            }
        } finally {
            cursor.close();
        }
        
        return list;
    }

    @Override
    public Sport getByTitle(String title) {
        Document doc = (Document) collection.find(eq("title", title)).first();
        Sport sport = new Sport();
        
        sport.setId(doc.get("_id").toString());
        sport.setHistory(doc.getString("history"));
        sport.setOverView(doc.getString("overView"));
        sport.setTitle(doc.getString("title"));

        return sport;
    }
    
}
