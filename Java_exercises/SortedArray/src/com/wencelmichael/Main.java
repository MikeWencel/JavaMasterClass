package com.wencelmichael;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    printArray(getIntegers(6));

    }

    public static int[] getIntegers(int num){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[num];
        for(int i = 0; i < arr.length;i++){
        arr[i] = scanner.nextInt();
        }
        scanner.close();
        return arr;
    }

    public static void printArray(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}
