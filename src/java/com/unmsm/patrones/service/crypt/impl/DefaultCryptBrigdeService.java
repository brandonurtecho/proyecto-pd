package com.unmsm.patrones.service.crypt.impl;

import com.unmsm.patrones.service.crypt.ICryptBridgeService;
import com.unmsm.patrones.service.crypt.ICryptService;

/**
 *
 * @author bluq1
 */
public class DefaultCryptBrigdeService implements ICryptBridgeService{
    private ICryptService encryptAlgorith;
    
    public DefaultCryptBrigdeService(ICryptService encryptAlgorith){
        this.encryptAlgorith = encryptAlgorith;
    }
    
    @Override
    public String encryptMessage(String message)throws Exception {
        return encryptAlgorith.encrypt(message);
    }
}