package com.mikewencel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(findMin(readIntegers(5)));
    }

    static int[] readIntegers(int number){
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[number];
        for(int i = 0; i < number;i++){

            System.out.println("Please enter numbers!");
            tab[i] =  scanner.nextInt();

        }
        scanner.close();
        return tab;
    }

    static int findMin(int tab[]){
    int minNumber = tab[0];

    for (int i = 1;i < tab.length;i++){
        if(minNumber > tab[i]){
            minNumber = tab[i];
        }else{
            minNumber = minNumber;
        }
    }
    return minNumber;
    }
}
