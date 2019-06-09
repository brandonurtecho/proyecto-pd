/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.connection;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author diego
 */
public class Connection {
    private static Connection connection;
    private static String uri = "mongodb://diego:72923854dv@ds135207.mlab.com:35207/heroku_t1k2033f";
    private MongoDatabase mongoDB;
    
    private Connection() {
        MongoClientURI mongouri = new MongoClientURI(uri);
        MongoClient cliente = new MongoClient(mongouri);
        mongoDB = cliente.getDatabase(mongouri.getDatabase());
    }
    
    public MongoCollection getCollection(String db_collection_name) {
        MongoCollection col = mongoDB.getCollection(db_collection_name);
        return col;
    }
    
    public static Connection getConnection() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }
}