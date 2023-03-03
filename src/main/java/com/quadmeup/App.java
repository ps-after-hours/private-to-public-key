package com.quadmeup;

import java.security.PrivateKey;
import java.security.PublicKey;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        final PrivateKeyLoader loader = new PrivateKeyLoader();
        final PrivateKeyConverter converter = new PrivateKeyConverter();

        PrivateKey key = loader.load("rsakey.pem");

        PublicKey publicKey = converter.convert(key);

        System.out.println( publicKey.toString() );
    }
}
