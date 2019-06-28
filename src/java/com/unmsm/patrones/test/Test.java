/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.test;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.unmsm.patrones.connection.Connection;
import com.unmsm.patrones.dto.Card;
import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.dto.PanamericanoSport;
import com.unmsm.patrones.dto.ParapanamericanoSport;
import com.unmsm.patrones.dto.Place;
import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.repository.IUserReadeable;
import com.unmsm.patrones.repository.IUserRepository;
import com.unmsm.patrones.repository.impl.UserDao;
import com.unmsm.patrones.service.ICommentaryService;
import com.unmsm.patrones.service.IUserService;
import com.unmsm.patrones.service.facade.IUserFacadeService;
import com.unmsm.patrones.service.facade.impl.UserFacadeService;
import com.unmsm.patrones.service.impl.CommentaryService;
import com.unmsm.patrones.service.impl.UserService;
import com.unmsm.patrones.util.Cast;
import com.unmsm.patrones.util.TypeCollections;
import com.unmsm.patrones.util.TypeSport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author diego
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
//        MongoCollection collection = Connection.getConnection().getCollection(TypeCollections.USERS);
//        
//        ICommentaryService service = new CommentaryService();
//        List<Commentary> list = service.showCommentaryBySport(TypeSport.FUTBOL);
//        for (Commentary com : list) {
//            System.out.println(com);
//        }
//        
//        System.out.println("");
//        list = service.showCommentaryBySport(TypeSport.BASKETBALL);
//        for (Commentary com : list) {
//            System.out.println(com);
//        }

        IUserFacadeService facade = new UserFacadeService();
        System.out.println(facade.login("dvera1096@gmail.com", "diego"));
        System.out.println("EVENTS: "+facade.getEvents());
        System.out.println("PAYMENT: "+facade.getPaymentsByEmail("dvera1096@gmail.com"));
        System.out.println("PLACES"+facade.getPlaces());
        System.out.println("COMMENTARY BADMINTON: "+facade.showCommentaryBySportInSport(TypeSport.BADMINTON));
        System.out.println("SPORT LIST: "+facade.showSportList(TypeSport.PANAMERICANO_SPORT));
        System.out.println("SPORT BY ID: "+facade.showSportById("5d05816ffb6fc00e79aa8fb0", TypeSport.PARAPANAMERICANO_SPORT));
        System.out.println("SPORTMAN: "+facade.showSportsmanBySportInSport(TypeSport.BADMINTON));
        System.out.println("VOLUNTEER: "+facade.showVolunteers());
        
        
//        Document doc = new Document("name", "MongoDB")
//                .append("type", "database")
//                .append("count", 1)
//                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
//                .append("info", new Document("x", 203).append("y", 102));
//        
//        Document d = new Document("email", "diego.vera@unmsm.edu.pe")
//                .append("password", "12345")
//                .append("genre", "Masculino")
//                .append("name", "Diego")
//                .append("lastname", "Vera")
//                .append("birthdate", "09-11-1996");
        //collection.insertOne(d);
        //System.out.println(collection.find(eq("email", "diego.vera@unmsm.edu.pe")).first());
        
//        User user = userRepository.getByEmail("diego.vera@unmsm.edu.pe");
//        if (user != null) {
//            System.out.println(user);
//        } else {
//            System.out.println("no se encontro");
//        }


        
        // INSERT
        //Document d = new Document("email", "diego.vera@unmsm.edu.pe")
        //        .append("password", "123456");
        //System.out.println(d);
        //collection.insertOne(d);
        
        
        // FIND ALL
        //MongoCursor<Document> cursor = collection.find().iterator();
        //    try {
        //        while (cursor.hasNext()) {
        //            System.out.println(cursor.next().toJson());
        //        }
        //    } finally {
        //        cursor.close();
        //    }

        
        // UPDATE
                
//        long cont = collection.updateOne(eq("email", "dvera1096@gmail.com"), 
//                new Document("$set", 
//                        new Document("email", "dvera1096@gmail.com")
//                            .append("password", "diego"))).getModifiedCount();
        
        // DELETE
        //System.out.println(collection.deleteOne(eq("email", "diego.vera@unmsm.edu.pe")));
        
        // FIND ONE
        //Document myDoc = (Document) collection.find(eq("email", "dvera1096@gmail.com")).first();
        
        //Document myDoc = (Document) collection.find(eq("_id", new ObjectId("5cfcaa5be7179a4e4321bd84"))).first();
        //System.out.println(myDoc);
    }
    
}
