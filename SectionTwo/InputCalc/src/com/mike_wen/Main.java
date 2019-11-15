package com.mike_wen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverange();


    }

    public static void inputThenPrintSumAndAverange() {
        int x;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        boolean hasNextInt = scan.hasNextInt();

        if (hasNextInt){
            x = scan.nextInt();
            while (hasNextInt){
                System.out.println("Enter your number: ");
                x = scan.nextInt();
                sum = x + sum;
            }
        }

        scan.nextInt();
        scan.close();

    }
}
