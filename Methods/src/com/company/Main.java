package com.company;

public class Main {

    public static void main(String[] args) {
	int yup = clacu(true,800,5,100);
    int pop = clacu(true,10000,8,200);
    }
    public static int clacu(boolean game,int score,int level,int bonus){
        if(game){
            int finalScore = score+(level*bonus);
            finalScore+=1000;
            System.out.println(finalScore);
            return finalScore;
        }
        return 0;
    }
}
