package com.company;

public class Main {

    public static void main(String[] args) {
	Gears mcLaren = new Gears(6);
    Gears.Gear first = mcLaren.new Gear(1,12.3);
//    Gears.Gear second = new Gears.Gear(2,15.4);
//    Gears.Gear third = new Gears.Gear(3,17.8);
        System.out.println(first.driveSpeed(1000));
    }
}
