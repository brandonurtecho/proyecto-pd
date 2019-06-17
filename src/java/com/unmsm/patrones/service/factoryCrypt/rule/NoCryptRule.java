/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.factoryCrypt.rule;

import com.unmsm.patrones.service.crypt.impl.NoCryptService;
import com.unmsm.patrones.util.TypeCrypt;

/**
 *
 * @author bluq1
 */
public class NoCryptRule implements ICryptRule<NoCryptService> {

    @Override
    public Boolean isMatch(String type) {
        return type.equals(TypeCrypt.NONE);
    }

    @Override
    public NoCryptService getObject() {
        return new NoCryptService();
    }
    
}
