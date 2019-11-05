package com.mike_wen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int count = 0;
    int max = 0;
    int min = 0;
    int number = 0;
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
    boolean hasNextInt = scanner.hasNextInt();

    if (hasNextInt){
        while (count < 10) {
            System.out.println("Enter number:");
            number = scanner.nextInt();

            System.out.println("Number is " + number);

            if (number >= number) {
                max = number;
            }

            if (number <= number) {
                min = number;
            }
            count++;
        }
    }



        scanner.close();
    }

}
