/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository;

import com.unmsm.patrones.dto.Payment;

/**
 *
 * @author diego
 */
public interface IPaymentRepository extends IPaymentReadeable {
    void insert(Payment payment);
}
