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
import com.unmsm.patrones.repository.ICommentaryRepository;
import com.unmsm.patrones.util.Cast;
import com.unmsm.patrones.util.TypeCollections;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author diego
 */
public class CommentaryDao implements ICommentaryRepository {

    MongoCollection collection
            = Connection.getConnection().getCollection(TypeCollections.COMMENTS);

    @Override
    public List<Commentary> getAll() {
        MongoCursor<Document> cursor = collection.find().iterator();
        List<Commentary> list = new ArrayList<>();

        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Commentary commentary = new Commentary.CommentaryBuilder()
                        .setId(doc.get("_id").toString())
                        .setBody(doc.getString("body"))
                        .setDate(Cast.stringToDate(doc.getString("date")))
                        .setLike(doc.getInteger("like"))
                        .setSport(doc.getString("sport"))
                        .setEmailUser(doc.getString("emailUser"))
                        .setNameUser(doc.getString("nameUser"))
                        .setLastNameUser(doc.getString("lastNameUser"))
                        .build();

                list.add(commentary);
            }
        } catch (ParseException ex) {
            Logger.getLogger(CommentaryDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cursor.close();
        }

        return list.size() > 0 ? list : Arrays.asList(Commentary.NULL_COMMENTARY);
    }

    @Override
    public List<Commentary> getBySport(String sport) {
        MongoCursor<Document> cursor = collection.find(eq("sport", sport)).iterator();
        List<Commentary> list = new ArrayList<>();

        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();

                Commentary commentary = new Commentary.CommentaryBuilder()
                        .setId(doc.get("_id").toString())
                        .setBody(doc.getString("body"))
                        .setDate(Cast.stringToDate(doc.getString("date")))
                        .setLike(doc.getInteger("like"))
                        .setSport(doc.getString("sport"))
                        .setEmailUser(doc.getString("emailUser"))
                        .setNameUser(doc.getString("nameUser"))
                        .setLastNameUser(doc.getString("lastNameUser"))
                        .build();
                list.add(commentary);
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(CommentaryDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cursor.close();
        }

        return list.size() > 0 ? list : Arrays.asList(Commentary.NULL_COMMENTARY);
    }

    @Override
    public void insert(Commentary commentary) {
        Document d = new Document("body", commentary.getBody())
                .append("date", Cast.dateToString(commentary.getDate()))
                .append("like", commentary.getLike())
                .append("sport", commentary.getSport())
                .append("emailUser", commentary.getEmailUser())
                .append("nameUser", commentary.getNameUser())
                .append("lastNameUser", commentary.getLastNameUser());
        collection.insertOne(d);
    }

    @Override
    public long update(Commentary commentary) {
        long cont = collection.updateOne(eq("_id", new ObjectId(commentary.getId())),
            new Document("$set",    
                new Document("body", commentary.getBody())
                        .append("date", Cast.dateToString(commentary.getDate()))
                        .append("like", commentary.getLike())
                        .append("sport", commentary.getSport())
                        .append("emailUser", commentary.getEmailUser())
                        .append("nameUser", commentary.getNameUser())
                        .append("lastNameUser", commentary.getLastNameUser())))
                .getModifiedCount();

        return cont;
    }

    @Override
    public long delete(Commentary commentary) {
        long cont = collection.deleteOne(eq("_id", new ObjectId(commentary.getId()))).getDeletedCount();
        return cont;
    }

}
