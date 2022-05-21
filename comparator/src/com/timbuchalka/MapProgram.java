package com.timbuchalka;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public  static void main(String[] args){
        Map<String,String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("java already exist");
        }
        else{
            languages.put("Java","a compiled falaa dikana");
            System.out.println("Java added successfully");
        }
        languages.put("python","its also useful");
        languages.put("Algo","an algo language");
        System.out.println(languages.put("C","Versatile language"));
        System.out.println(languages.put("BASIC","Begginers All purpose symbolic instruction code"));
        if(languages.containsKey("Java")){
            System.out.println("Java already in it");
        }
        else {
            languages.put("Java", "Good to know");
        }
        //languages.remove("C");
        if(languages.remove("Algo","a family")){
            System.out.println("Algo removed");
        }
        else{
            System.out.println("Not removed cause pair not found");
        }
        if(languages.replace("C","Versatile language","Not very good versaile")){
            System.out.println("replaced");
        }
        else{
            System.out.println("NOPEEE");
        }
        System.out.println(languages.replace("Scala","what the heeel"));
        for(String key:languages.keySet()){
            System.out.println(key+" : "+languages.get(key));
        }
    }
}
