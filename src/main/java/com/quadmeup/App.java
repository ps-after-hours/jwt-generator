package com.quadmeup;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            JwtGenerator generator = new JwtGenerator();

            Map<String, String> claims = new HashMap<>();
            
            claims.put("action", "read");
            claims.put("sub", "pawel.spychalski");
            claims.put("email", "test@quadmeup.com");
            claims.put("aud", "*");

            String token = generator.generateJwt(claims);
            System.out.println( token);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
