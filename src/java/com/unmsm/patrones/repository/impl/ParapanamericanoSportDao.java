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
import com.unmsm.patrones.dto.ParapanamericanoSport;
import com.unmsm.patrones.dto.factory.SportFactory;
import com.unmsm.patrones.repository.IParapanamericanoSportRepository;
import com.unmsm.patrones.util.TypeCollections;
import com.unmsm.patrones.util.TypeSport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author diego
 */
public class ParapanamericanoSportDao implements IParapanamericanoSportRepository {

    MongoCollection collection = Connection.getConnection().getCollection(TypeCollections.PARAPANAMERICANO_SPORTS);
    SportFactory<ParapanamericanoSport> sportFactory = new SportFactory<>();
    
    @Override
    public List<ParapanamericanoSport> getAll() {
        MongoCursor<Document> cursor = collection.find().iterator();
        List<ParapanamericanoSport> list = new ArrayList<>();
        
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                ParapanamericanoSport sport = sportFactory.getSport(TypeSport.PARAPANAMERICANO_SPORT);
                
                sport.setId(doc.get("_id").toString());
                sport.setHistory(doc.getString("history"));
                sport.setOverView(doc.getString("overView"));
                sport.setTitle(doc.getString("title"));
                sport.setImage(doc.getString("image"));
                
                list.add(sport);
            }
        } finally {
            cursor.close();
        }
        
        return list.size() > 0 ? list : Arrays.asList(ParapanamericanoSport.NULL_PARAPANAMERICANO_SPORT);
    }

    @Override
    public ParapanamericanoSport getById(String id) {
        Document doc = (Document) collection.find(eq("_id", new ObjectId(id))).first();
        ParapanamericanoSport sport = null;
        
        try {
            sport = sportFactory.getSport(TypeSport.PARAPANAMERICANO_SPORT);
                
            sport.setId(doc.get("_id").toString());
            sport.setHistory(doc.getString("history"));
            sport.setOverView(doc.getString("overView"));
            sport.setTitle(doc.getString("title"));
        
        } catch(Exception e) {
            System.out.println(e);
        }
        
        return sport != null ? sport : ParapanamericanoSport.NULL_PARAPANAMERICANO_SPORT;
    }
    
}
