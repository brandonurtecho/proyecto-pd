/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.Payment;
import com.unmsm.patrones.repository.IPaymentRepository;
import com.unmsm.patrones.repository.impl.PaymentDao;
import com.unmsm.patrones.service.IPaymentService;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author bluq1
 */
public class PaymentService implements IPaymentService {
    private IPaymentRepository paymentRepository;
    private final static String FROM_EMAIL = "histerer@hotmail.com";
    private final static String FROM_PASS = "p4nameric4nosl*ma";
    private final static String SUBJECT = "Recibo de juegos panamericanos y parapanamericanos";
    
    public PaymentService() {
        this.paymentRepository = new PaymentDao();
    }
    
    private void sendPaymentEmail(Payment payment) {

        Properties props = new Properties();
        /**
         * Parametros de conexion al servidor hotmail
         */
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", "smtp.live.com");
        props.put("mail.smtp.socketFactory.port", "587");
        props.put("mail.smtp.socketFactory.fallback", "false");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM_EMAIL, FROM_PASS);
            }
        });

        session.setDebug(true);

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FROM_EMAIL)); //remitente

            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(payment.getEmail())); //destinatario
            message.setSubject(SUBJECT);//asunto
            message.setText(createMessage(payment)); //cuerpo del mensaje
            /**
             * metodo para enviar mensaje creado
             */
            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
    private String createMessage(Payment payment){
        StringBuilder messageBody = new StringBuilder();
        messageBody
                .append("ACA SE DEBE FORMAR EL CUERPO CON LA CLASE PAYMENT")
                .append(" DE ESTA FORMA")
                .append(" ESTE ES UN MENSAJE DE EJEMPLO");
        return messageBody.toString();
    }

    @Override
    public List<Payment> getAll() {
        return paymentRepository.getAll();
    }

    @Override
    public List<Payment> getPaymentsByEmailUser(String email) {
        return paymentRepository.getPaymentsByUserEmail(email);
    }

    @Override
    public void pay(Payment payment) {
        paymentRepository.insert(payment);
        //sendPaymentEmail(payment);
    }

}
