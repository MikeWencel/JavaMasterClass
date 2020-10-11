package com.mikewencel;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println(getIntegers());
        writeArray(getIntegers());
    }

    public static int[] getIntegers(){
        System.out.println("How long is your array");
        int number = scanner.nextInt();
        int newArray[] = new int[number];
        System.out.println("Please enter " + number + " numbers\r");
        for (int i = 0;i < newArray.length;i++){
        newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public static void writeArray(int array[]){
        for(int element : array){
            System.out.println(element);
        }
    }

}
