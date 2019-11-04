package com.mike_wen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            while (count < 10) {
                System.out.println("Enter your number: ");
                int number = scanner.nextInt();
                sum = number + number;
                count++;
            }
            System.out.println("Sum of your numbers is: "+ sum);


            scanner.close();
        }else {
            System.out.println("Invalid value");
        }


    }



}
