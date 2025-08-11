package com.cognizant.spring_learn.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.util.Date;
import java.util.Base64;
import javax.crypto.SecretKey;

public class JwtUtil {

    private static final long EXPIRATION_TIME = 1000 * 60 * 10; // 10 minutes
    private static final SecretKey SECRET_KEY = Keys.hmacShaKeyFor(
            Base64.getEncoder().encode("secret-key-to-change-in-prod".getBytes())
    );

    public static String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SECRET_KEY, SignatureAlgorithm.HS256)
                .compact();

    }
    public static Claims validateToken(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(SECRET_KEY)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

}
