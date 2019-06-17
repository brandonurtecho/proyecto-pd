/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.factoryCrypt;

import com.unmsm.patrones.service.factoryCrypt.rule.ICryptRule;
import com.unmsm.patrones.service.factoryCrypt.rule.DESCryptRule;
import com.unmsm.patrones.service.factoryCrypt.rule.NoCryptRule;
import com.unmsm.patrones.service.factoryCrypt.rule.AESCryptRule;
import com.unmsm.patrones.service.crypt.ICryptService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bluq1
 * @param <T>
 */
public class CryptFactory<T extends ICryptService> {
    private List<ICryptRule> listCryptRule;
    
    public CryptFactory() {
        listCryptRule = new ArrayList<>();
        listCryptRule.add(new DESCryptRule());
        listCryptRule.add(new AESCryptRule());
        listCryptRule.add(new NoCryptRule());
    }   
    
    public T getCrypt(String type){
        for (ICryptRule<T> cryptRule : listCryptRule) {
            if(cryptRule.isMatch(type)){
                return cryptRule.getObject();
            }
        }
        return null;
    }
}
