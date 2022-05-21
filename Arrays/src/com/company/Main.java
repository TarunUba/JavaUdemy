package com.company;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int []myArray = getIntegers(5);
        printMyArray(myArray);
        System.out.println("The average is "+average(myArray));
        Arrays.sort(myArray);
        int i, k, t;
        int n = myArray.length;
        for (i = 0; i < n / 2; i++) {
            t = myArray[i];
            myArray[i] = myArray[n - i - 1];
            myArray[n - i - 1] = t;
        }
        printMyArray(myArray);
        int[]sorti = Arrays.copyOf(myArray,myArray.length);
        printMyArray(sorti);
    }
    public static void printMyArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("The number at index "+ i + " is "+array[i]);
        }
    }
    public static int[] getIntegers(int i){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter "+ i +" Integer Values");
        int[]values = new int[i];
        for(int j=0;j<i;j++){
            values[j] = scanner.nextInt();
        }
        return values;
    }
    public static double average(int[] array){
        int sum =0;
        int len = array.length;
        for(int i=0;i<len;i++){
            sum+=array[i];
        }
        return (double)sum/((double) len);
    }
}
