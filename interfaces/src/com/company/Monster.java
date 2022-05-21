package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable{
    ArrayList<String> monsters;

    @Override
    public void save(List<String> lol) {
    }

    @Override
    public ArrayList<String> giveBack() {
        return monsters;
    }
}
