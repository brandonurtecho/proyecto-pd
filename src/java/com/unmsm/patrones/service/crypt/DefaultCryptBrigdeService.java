package com.unmsm.patrones.service.crypt;

import com.unmsm.patrones.service.ICryptService;
import com.unmsm.patrones.service.ICryptBridgeService;

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