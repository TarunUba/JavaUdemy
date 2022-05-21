package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player Tim = new Player("Tim",10,15,"sword");
        System.out.println(Tim.toString());
        saveObject(Tim);
        Tim.setHitPoints(8);
        System.out.println(Tim);
        Tim.setWeapon("StromBinger");
        saveObject(Tim);
        loadObject(Tim);
        System.out.println(Tim);
    }
public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    int index =0;
    System.out.println("Choose\n"+"1 to enter a string\n"+"0 to quit");
    while(!quit){
        System.out.println("Choose an option");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1:
                System.out.println("Enter a string");
                String stringInput = scanner.nextLine();
                values.add(index,stringInput);
                index++;
                break;
            case 0:
                quit = true;
                break;
        }
    }
    return values;
}
public static  void saveObject(Saveable objectTo){
        for(int i=0;i<objectTo.giveBack().size();i++){
            System.out.println("Saving"+objectTo.giveBack().get(i)+"to storage device");
        }
}
public  static void loadObject(Saveable obejectTo){
        ArrayList<String> values = readValues();
        obejectTo.save(values);
}
}
