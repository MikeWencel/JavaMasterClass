package com.wencelmichael;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    getIntegers();




    }

    public static void getIntegers(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i < arr.length;i++){
        arr[i] = scanner.nextInt();
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}
