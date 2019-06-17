/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.factoryCrypt.rule;

import com.unmsm.patrones.service.crypt.ICryptService;

/**
 *
 * @author bluq1
 * @param <T>
 */
public interface ICryptRule<T extends ICryptService> {
    Boolean isMatch(String type);
    T getObject();
}
