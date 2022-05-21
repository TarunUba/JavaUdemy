package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable{
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength, String weapon) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public void save(List<String> lol) {
       if(lol!=null && lol.size()>0){
           this.name = lol.get(0);
           this.hitPoints = Integer.parseInt(lol.get(1));
           this.strength = Integer.parseInt(lol.get(2));
           this.weapon = lol.get(3);
       }
    }

    @Override
    public List<String> giveBack() {
        List<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,""+this.hitPoints);
        values.add(2,""+this.strength);
        values.add(3,this.weapon);
        return values;
    }
}
