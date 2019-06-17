package com.unmsm.patrones.service.crypt.impl;

import com.unmsm.patrones.service.crypt.ICryptService;
import javax.crypto.Cipher;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author bluq1
 */
public class DESCryptService implements ICryptService{
    
    private static final String KEY = "XMzDdG4D";
    private static final String INIT_VECTOR = "JGbWW2ML";

    @Override
    public String encrypt(String message) throws Exception {
        try {
            IvParameterSpec iv = new IvParameterSpec(KEY.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(INIT_VECTOR.getBytes("UTF-8"), "DES");
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5PADDING");
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