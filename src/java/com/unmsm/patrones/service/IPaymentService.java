/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service;

import com.unmsm.patrones.dto.Payment;
import java.util.List;

/**
 *
 * @author bluq1
 */
public interface IPaymentService {
    void pay(Payment payment);
    List<Payment> getAll();
    List<Payment> getPaymentsByEmailUser(String email);
    void sendPaymentEmail(Payment payment);
}
