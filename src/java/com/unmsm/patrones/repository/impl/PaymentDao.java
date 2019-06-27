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
import com.unmsm.patrones.dto.Event;
import com.unmsm.patrones.dto.Payment;
import com.unmsm.patrones.repository.IPaymentRepository;
import com.unmsm.patrones.util.TypeCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author diego
 */
public class PaymentDao implements IPaymentRepository {

    MongoCollection collection
            = Connection.getConnection().getCollection(TypeCollections.PAYMENTS);

    @Override
    public void insert(Payment payment) {
        Document d = new Document("address", payment.getAddress())
                .append("card", new Document("cardNumber", payment.getCard().getCardNumber())
                        .append("cvv", payment.getCard().getCvv())
                        .append("expiration", payment.getCard().getExpiration())
                        .append("nameOnCard", payment.getCard().getNameOncard()))
                .append("country", payment.getCountry())
                .append("email", payment.getEmail())
                .append("events", payment.getEventList())
                .append("firstName", payment.getFirstName())
                .append("lastName", payment.getLastName())
                .append("optionalAddress", payment.getOptionalAddress())
                .append("paypalEmail", payment.getPaypalEmail())
                .append("state", payment.getState())
                .append("zipCode", payment.getZipCode());
        collection.insertOne(d);
    }

    @Override
    public List<Payment> getAll() {

        MongoCursor<Document> cursor = collection.find().iterator();
        List<Payment> list = new ArrayList<>();

        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Payment payment = new Payment.PaymentBuilder()
                        .setAddress(doc.getString("address"))
                        //.setCard(Card.NULL_CARD)
                        .setCountry(doc.getString("country"))
                        .setEmail(doc.getString("email"))
                        .setEventList((List<Event>) doc.get("events"))
                        .setFirstName(doc.getString("firstName"))
                        .setId(doc.get("_id").toString())
                        .setLastName(doc.getString("lastName"))
                        .setOptionalAddress(doc.getString("optionalAddress"))
                        .setPaypal(doc.getString("paypalEmail"))
                        .setState(doc.getString("state"))
                        .setZipCode(doc.getString("zipCode"))
                        .build();

                list.add(payment);
            }
        } finally {
            cursor.close();
        }

        return list.size() > 0 ? list : Arrays.asList(Payment.NULL_PAYMENT);
    }

    @Override
    public List<Payment> getPaymentsByUserEmail(String email) {
        MongoCursor<Document> cursor = collection.find(eq("email", email)).iterator();
        List<Payment> list = new ArrayList<>();

        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Payment payment = new Payment.PaymentBuilder()
                        .setAddress(doc.getString("address"))
                        //.setCard(Card.NULL_CARD)
                        .setCountry(doc.getString("country"))
                        .setEmail(doc.getString("email"))
                        .setEventList((List<Event>) doc.get("events"))
                        .setFirstName(doc.getString("firstName"))
                        .setId(doc.get("_id").toString())
                        .setLastName(doc.getString("lastName"))
                        .setOptionalAddress(doc.getString("optionalAddress"))
                        .setPaypal(doc.getString("paypalEmail"))
                        .setState(doc.getString("state"))
                        .setZipCode(doc.getString("zipCode"))
                        .build();

                list.add(payment);
            }
        } finally {
            cursor.close();
        }

        return list.size() > 0 ? list : Arrays.asList(Payment.NULL_PAYMENT);
    }

}
