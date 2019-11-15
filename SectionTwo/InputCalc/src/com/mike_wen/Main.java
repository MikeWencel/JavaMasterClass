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

        while (hasNextInt) {
            System.out.println("Enter number: ");
            hasNextInt = scan.hasNextInt();

        }

        scan.nextInt();
        scan.close();

    }
}
