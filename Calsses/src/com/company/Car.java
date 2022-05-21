package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;

    public void setModel(String model){
        this.model = model;
    }
    public Car(){
        System.out.println("constructor lol .");
    }

    public Car(int doors, int wheels) {
        this.doors = doors;
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }
}
