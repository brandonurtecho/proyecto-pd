package com.unmsm.patrones.service.crypt;

import com.unmsm.patrones.service.ICryptService;
import com.unmsm.patrones.service.IMessageCryptService;

/**
 *
 * @author bluq1
 */
public class DefaultMessageCryptService implements IMessageCryptService{
    private ICryptService encryptAlgorith;
    
    public DefaultMessageCryptService(ICryptService encryptAlgorith){
        this.encryptAlgorith = encryptAlgorith;
    }
    
    @Override
    public String encryptMessage(String message)throws Exception {
        return encryptAlgorith.encrypt(message);
    }
}