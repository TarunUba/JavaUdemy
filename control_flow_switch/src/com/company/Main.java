package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int switchValue = 13;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Its 2 now ");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3,4 or 5");
                break;
            default:
                System.out.println("was not 1 and 2");
                break;
        }
        char check = 'D';
        switch(check){
            case 'A':
                System.out.println("its A");
                break;
            default:
                System.out.println("You are a failure");
        }
        String koi = "JanuAry";
        switch (koi.toLowerCase()){
            case "january":
                System.out.println("It works");
                break;
            default:
                System.out.println("f");
                break;
        }
        for(int i=0;i<10;i++){
            double kol = i*1.456;
            System.out.println("This is"+String.format(" %.2f",kol));
        }
        String bum = "20323";
        int number = Integer.parseInt(bum);
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Birth Year: ");
        int year  = scanner.nextInt();
        scanner.nextLine();//handles
        System.out.println("Enter Your Name: ");
        String name  = scanner.nextLine();

        System.out.println("Your name is "+name+" of age "+(2022-year));
        scanner.close();

    }
}
