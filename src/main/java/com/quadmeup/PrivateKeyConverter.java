package com.quadmeup;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;

public class PrivateKeyConverter {
    
    /**
     * This method conerts a PriveKey to a PublicKey. Used algorithm is RSA
     * @param privateKey
     * @return
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     */
    public PublicKey convert(PrivateKey privateKey) throws NoSuchAlgorithmException, InvalidKeySpecException {
        final RSAPrivateCrtKey rsaPrivateCrtKey = (RSAPrivateCrtKey) privateKey;

        final RSAPublicKeySpec publicKeySpec = new RSAPublicKeySpec(rsaPrivateCrtKey.getModulus(),
                rsaPrivateCrtKey.getPublicExponent());

        final KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePublic(publicKeySpec);
    }

}
