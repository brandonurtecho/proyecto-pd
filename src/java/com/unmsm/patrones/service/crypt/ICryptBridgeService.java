package com.unmsm.patrones.service.crypt;

/**
 *
 * @author bluq1
 */
public interface ICryptBridgeService {
    String encryptMessage(String message, String type)throws Exception;
}