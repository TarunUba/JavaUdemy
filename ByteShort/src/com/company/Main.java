package com.company;

public class Main {

    public static void main(String[] args) {
	int maxi = Integer.MAX_VALUE;
    int mini = Integer.MIN_VALUE;
    System.out.println("Max value of int is = " + maxi);
    System.out.println("Min value of int is = " + mini);
    System.out.println("Min value of int is = " + (mini -1));//underflow
    System.out.println("Min value of int is = " + (maxi +1));//overflow

    int maxiByte = Byte.MAX_VALUE;
    int miniByte = Byte.MIN_VALUE;
    System.out.println("Max value of B is = " + maxiByte);
    System.out.println("Min value of B is = " + miniByte);

    int maxiShort = Short.MAX_VALUE;
    int miniShort = Short.MIN_VALUE;
    System.out.println("Max value of S is = " + maxiShort);
    System.out.println("Min value of S is = " + miniShort);

    float maxiFloat = 5.35f;
    float miniFloat = Float.MIN_VALUE;
    System.out.println("Max value of F is = " + maxiFloat);
    System.out.println("Min value of F is = " + miniFloat);

    long maxiLong = Long.MAX_VALUE;
    long miniLong = Long.MIN_VALUE;
    System.out.println("Max value of L is = " + maxiLong);
    System.out.println("Min value of L is = " + miniLong);

    Double maxiDouble = 23.57;
    Double miniDouble = Double.MIN_VALUE;
    System.out.println("Max value of L is = " + maxiDouble);
    System.out.println("Min value of L is = " + miniDouble);

    byte bom = (byte)(maxi/2);
    System.out.println(bom);
    byte lol = 4;
    short kol = 12324;
    int pop = 328423;
    long sop = (long)(50000 + 10*(lol+kol+pop));
    System.out.println(sop);
    }
}
