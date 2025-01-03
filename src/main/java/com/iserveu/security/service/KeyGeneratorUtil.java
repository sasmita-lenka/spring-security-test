package com.iserveu.security.service;

import java.util.Base64;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class KeyGeneratorUtil {

	public static void main(String[] args) {
        try {
            // Generate a secure key
            KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");
            keyGenerator.init(256); // Key size must be 256 bits for HS256
            SecretKey secretKey = keyGenerator.generateKey();

            // Encode the key as a Base64 string
            String base64EncodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());

            // Print the key
            System.out.println("Secure Base64-encoded Secret Key:");
            System.out.println(base64EncodedKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }	

}
