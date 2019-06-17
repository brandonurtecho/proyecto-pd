package com.unmsm.patrones.service.crypt.impl;

import com.unmsm.patrones.service.crypt.ICryptService;

/**
 *
 * @author bluq1
 */
public class NoCryptService implements ICryptService{
    @Override
    public String encrypt(String message) throws Exception {
        return message;
    }
}