package com.wencelmichael;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    int array[] = {3,4,5,2,1};
    sortIntegers(array);
    printArray(array);
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
            System.out.println("Element " + i +" contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int arr[]){
        int ch = 1;
        while (ch > 0){
            ch = 0;
         for (int i = 0;i < arr.length-1;i++) {
             //Sprawdź czy 1 liczba jest większa od 2
             if (arr[i] < arr[i + 1]) {
                 int low = arr[i];
                 arr[i] = arr[i + 1];
                 arr[i + 1] = low;
                 ch++;
             }
         }

        }
        return arr;
    }


}
