/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.factoryCrypt.rule;

import com.unmsm.patrones.service.crypt.impl.AESCryptService;
import com.unmsm.patrones.util.TypeCrypt;

/**
 *
 * @author bluq1
 */
public class AESCryptRule implements ICryptRule<AESCryptService> {

    @Override
    public Boolean isMatch(String type) {
        return type.equals(TypeCrypt.AES);
    }

    @Override
    public AESCryptService getObject() {
        return new AESCryptService();
    }
    
}
