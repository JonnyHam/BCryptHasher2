package com.example.BCryptHasher2;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class Bcrypt2 {
    private String password = "thomas123";

    private String hashedPassword = BCrypt.hashpw((password, BCrypt.gensalt(10));

}