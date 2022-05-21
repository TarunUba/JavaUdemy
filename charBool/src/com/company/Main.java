package com.company;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';
        char myPluChar = '\u0044';
        System.out.println(myPluChar);
        boolean myTrue = true;
        String koli = "This is my time: 10:";
        int lol = 10;
        koli += 10;
        System.out.println(koli);
        if (myTrue) {
            System.out.println("wwwut");
        }
        int topScore = 80;
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("This number is greater than second topscore and smaller than 100");
        }
        boolean car = false;
        if (car == true) {
            System.out.println(car + " why i am doing this");
        }
        boolean wasCar = car ? true : false;
        if (wasCar) {
            System.out.println("wasCar was false");
        }
        else{
            System.out.println("Got here");
        }
    }
}
