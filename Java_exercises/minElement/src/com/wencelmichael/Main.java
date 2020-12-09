package com.wencelmichael;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println(findMin(readElements(readInteger())));
    }

    private static int readInteger (){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    public static int[] readElements(int num){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[num];
        for (int i = 0;i < num;i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int findMin(int arr []){
    int ch = 1;
    while (ch > 0){
        ch = 0;
        for (int i = 0;i <arr.length - 1;i++){
            if (arr[i] > arr[i+1]){
                int low = arr[i+1];
                arr[i + 1] = arr[i];
                arr[i] = low;
                ch++;
            }
        }
    }
    return arr[0];
    }

}
