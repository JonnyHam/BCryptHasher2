package com.example.BCryptHasher2;

public class Runner {
    public static void main (String[] args) {
        String pTest = "monkey123";
        Bcrypt2 test = new Bcrypt2(pTest);
        System.out.println(test.hasher());
    }
}
