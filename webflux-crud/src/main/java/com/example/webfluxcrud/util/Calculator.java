package com.example.webfluxcrud.util;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println(a + " + " + b + " = " + add(a, b));
    }
}
