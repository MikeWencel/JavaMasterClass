package com.mikewencel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int finalArray[] = sortedArray(getIntegers());
        descentArray(finalArray);
        writeArray(finalArray);


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

    public static int[] sortedArray(int array[]){

        Arrays.sort(array);

        return array;
    }

    public static int[] descentArray(int array[]){
        int newbie [] = new int[array.length];
        int c = 0;
        for(int i = array.length -1;i >= 0;i--){
            newbie[c] = array[i];
            c++;
        }
        for(int i = 0; i < newbie.length;i++){
            array[i] = newbie[i];
        }

        return array;
    }



}
