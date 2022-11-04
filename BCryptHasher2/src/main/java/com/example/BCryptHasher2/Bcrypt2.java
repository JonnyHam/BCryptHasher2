package com.example.BCryptHasher2;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class Bcrypt2 {
    private String password;
    private String hashedPassword;

    public Bcrypt2 (String p) {
        password = p;
    }

    public String hasher () {
        return BCrypt.hashpw(password, BCrypt.gensalt(10));
    }

}