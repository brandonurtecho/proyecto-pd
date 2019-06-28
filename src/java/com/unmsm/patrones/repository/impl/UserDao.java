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
import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.dto.factory.PersonFactory;
import com.unmsm.patrones.repository.IUserRepository;
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
public class UserDao implements IUserRepository {

    MongoCollection collection
            = Connection.getConnection().getCollection(TypeCollections.USERS);
    PersonFactory<User> personFactory = new PersonFactory<>();

    @Override
    public List<User> getAll() {
        MongoCursor<Document> cursor = collection.find().iterator();
        List<User> list = new ArrayList<>();

        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                User user = personFactory.getPerson(TypePerson.USER);

                user.setId(doc.get("_id").toString());
                user.setEmail(doc.getString("email"));
                user.setPassword(doc.getString("password"));
                user.setGenre(doc.getString("genre"));
                user.setName(doc.getString("name"));
                user.setLastname(doc.getString("lastname"));
                user.setBirthdate(Cast.stringToDate(doc.getString("birthdate")));

                list.add(user);
            }
        } catch (ParseException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cursor.close();
        }

        return list.size() > 0 ? list : Arrays.asList(User.NULL_USER);
    }

    @Override
    public User getByEmail(String email) {
        Document doc = (Document) collection.find(eq("email", email)).first();
        User user = personFactory.getPerson(TypePerson.USER);

        if (doc != null) {
            try {
                user.setId(doc.get("_id").toString());
                user.setEmail(doc.getString("email"));
                user.setPassword(doc.getString("password"));
                user.setGenre(doc.getString("genre"));
                user.setName(doc.getString("name"));
                user.setLastname(doc.getString("lastname"));
                user.setBirthdate(Cast.stringToDate(doc.getString("birthdate")));
            } catch (ParseException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return doc != null ? user : User.NULL_USER;
    }

    @Override
    public void insert(User user) {
        Document d = new Document("email", user.getEmail())
                .append("password", user.getPassword())
                .append("birthdate", Cast.dateToString(user.getBirthdate()))
                .append("genre", user.getGenre())
                .append("lastname", user.getLastname())
                .append("name", user.getName());
        collection.insertOne(d);
    }

    @Override
    public long update(User user) {
        long cont = collection.updateOne(eq("email", user.getEmail()),
                new Document("$set",
                        new Document("email", user.getEmail())
                                .append("password", user.getPassword())
                                .append("birthdate", Cast.dateToString(user.getBirthdate()))
                                .append("genre", user.getGenre())
                                .append("lastname", user.getLastname())
                                .append("name", user.getName())))
                .getModifiedCount();

        return cont;
    }

    @Override
    public long delete(String email) {
        long cont = collection.deleteOne(eq("email", email)).getDeletedCount();
        return cont;
    }

}
