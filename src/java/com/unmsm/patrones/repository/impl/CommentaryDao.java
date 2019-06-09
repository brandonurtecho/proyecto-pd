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
import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.repository.ICommentaryReadeable;
import com.unmsm.patrones.util.Cast;
import com.unmsm.patrones.util.TypeCollections;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author diego
 */
public class CommentaryDao implements ICommentaryReadeable{

    MongoCollection collection = Connection.getConnection().getCollection(TypeCollections.COMMENTS);
    
    @Override
    public List<Commentary> getAll() {
        MongoCursor<Document> cursor = collection.find().iterator();
        List<Commentary> list = new ArrayList<>();
        
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Commentary commentary = new Commentary();
                
                commentary.setId(doc.get("_id").toString());
                commentary.setBody(doc.getString("body"));
                commentary.setDate(Cast.stringToDate(doc.getString("date")));
                commentary.setLike(doc.getInteger("like"));
                commentary.setSport(doc.getString("sport"));
                commentary.setTitle(doc.getString("title"));
                
                list.add(commentary);
            }
        } catch (ParseException ex) {
            Logger.getLogger(CommentaryDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cursor.close();
        }
        
        return list;
    }

    @Override
    public List<Commentary> getBySport(String sport) {
        MongoCursor<Document> cursor = collection.find(eq("sport", sport)).iterator();
        List<Commentary> list = new ArrayList<>();
        
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Commentary commentary = new Commentary();
                
                commentary.setId(doc.get("_id").toString());
                commentary.setBody(doc.getString("body"));
                commentary.setDate(Cast.stringToDate(doc.getString("date")));
                commentary.setLike(doc.getInteger("like"));
                commentary.setSport(doc.getString("sport"));
                commentary.setTitle(doc.getString("title"));
                
                list.add(commentary);
            }
        } catch (ParseException ex) {
            Logger.getLogger(CommentaryDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cursor.close();
        }
        
        return list;
    }

    @Override
    public void insert(Commentary commentary) {
        Document d = new Document("body", commentary.getBody())
                .append("date", Cast.dateToString(commentary.getDate()))
                .append("like", commentary.getLike())
                .append("sport", commentary.getSport())
                .append("title", commentary.getTitle());
        collection.insertOne(d);
    }

    @Override
    public long update(Commentary commentary) {
        long cont = collection.updateOne(eq("_id", new ObjectId(commentary.getId())), 
                            new Document("body", commentary.getBody())
                                .append("date", Cast.dateToString(commentary.getDate()))
                                .append("like", commentary.getLike())
                                .append("sport", commentary.getSport())
                                .append("title", commentary.getTitle()))
                    .getModifiedCount();
        
        return cont;
    }

    @Override
    public long delete(String id) {
        long cont = collection.deleteOne(eq("_id", new ObjectId(id))).getDeletedCount();
        return cont;
    }
    
}
