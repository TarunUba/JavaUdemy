package com.tarunuba;

public class Main {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Printing form the runnable");
            System.out.println("Line 2");
            System.out.println("Line 3 balb");
        }).start();
    }
}


