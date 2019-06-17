package com.unmsm.patrones.service.crypt.impl;

import com.unmsm.patrones.service.crypt.ICryptService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;

/**
 *
 * @author bluq1
 */
public class AESCryptService implements ICryptService {
    
    private static final String KEY = "HG58YZ3CR9123456";
    private static final String INIT_VECTOR = "WES16WCA82FKHC9E";

    @Override
    public String encrypt(String message) throws Exception {
        try {
            IvParameterSpec iv = new IvParameterSpec(KEY.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(INIT_VECTOR.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
            byte[] encrypted = cipher.doFinal(message.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (UnsupportedEncodingException 
                | InvalidAlgorithmParameterException 
                | InvalidKeyException | NoSuchAlgorithmException 
                | BadPaddingException | IllegalBlockSizeException 
                | NoSuchPaddingException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}