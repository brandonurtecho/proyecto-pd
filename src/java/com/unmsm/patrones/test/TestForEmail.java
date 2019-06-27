/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.test;

import com.unmsm.patrones.service.IPaymentService;
import com.unmsm.patrones.service.impl.PaymentService;

/**
 *
 * @author bluq1
 */
public class TestForEmail {
    public static void main(String[] args) {
        IPaymentService paymentService = new PaymentService();
    }
}
