package com.unmsm.patrones.service.crypt.impl;

import com.unmsm.patrones.service.crypt.ICryptBridgeService;
import com.unmsm.patrones.service.crypt.ICryptService;
import com.unmsm.patrones.util.TypeCrypt;
import java.util.HashMap;

/**
 *
 * @author bluq1
 */
public class DefaultCryptBrigdeService implements ICryptBridgeService{
    private HashMap<String, ICryptService> map;
    
    public DefaultCryptBrigdeService(){
        this.map = new HashMap<>();
        this.map.put(TypeCrypt.ADMIN, new DESCryptService());
        this.map.put(TypeCrypt.USER, new AESCryptService());
    }
    
    @Override
    public String encryptMessage(String message, String type)throws Exception {
        return map.get(type).encrypt(message);
    }
}