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
import com.unmsm.patrones.dto.Admin;
import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.dto.factory.PersonFactory;
import com.unmsm.patrones.repository.IAdminRepository;
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
public class AdminDao implements IAdminRepository{

    MongoCollection collection = 
            Connection.getConnection().getCollection(TypeCollections.ADMINS);
    PersonFactory<Admin> personFactory = new PersonFactory<>();
    
    @Override
    public List<Admin> getAll() {
        MongoCursor<Document> cursor = collection.find().iterator();
        List<Admin> list = new ArrayList<>();
        
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Admin admin = personFactory.getPerson(TypePerson.ADMIN);
                
                admin.setId(doc.get("_id").toString());
                admin.setEmail(doc.getString("email"));
                admin.setPassword(doc.getString("password"));
                admin.setName(doc.getString("name"));
                admin.setLastname(doc.getString("lastname"));
                
                list.add(admin);
            }
        } finally {
            cursor.close();
        }
        
        return list.size() > 0 ? list :Arrays.asList(Admin.NULL_ADMIN);
    }

    @Override
    public Admin getAdminByEmail(String email) {
        Document doc = (Document) collection.find(eq("email", email)).first();
        Admin admin = personFactory.getPerson(TypePerson.ADMIN);
        
        if (doc != null) {
            
            admin.setId(doc.get("_id").toString());
            admin.setEmail(doc.getString("email"));
            admin.setPassword(doc.getString("password"));
            admin.setName(doc.getString("name"));
            admin.setLastname(doc.getString("lastname"));
            admin.setDni(doc.getString("dni"));
            admin.setPhone(doc.getString("phone"));
            admin.setAge(doc.getString("age"));
            admin.setGenre(doc.getString("genre"));
        }
        
        return doc != null ? admin : Admin.NULL_ADMIN;
    }
    
    @Override
    public long update(Admin admin) {
        long cont = collection.updateOne(eq("email", admin.getEmail()),
                new Document("$set",
                        new Document("email", admin.getEmail())
                                .append("password", admin.getPassword())                               
                                .append("lastname", admin.getLastname())
                                .append("name", admin.getName())
                                .append("dni", admin.getDni())
                                .append("phone", admin.getPhone())
                                .append("age", admin.getAge())
                                .append("genre", admin.getGenre())))
                .getModifiedCount();

        return cont;
    }
    
}
