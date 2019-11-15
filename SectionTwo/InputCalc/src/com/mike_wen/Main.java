package com.mike_wen;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputSumAndAverage();
    }

    public static void inputSumAndAverage(){
        int sum = 0;
        int count = 1;
        double average = 0;
        Scanner scanner = new Scanner(System.in);



        while (true){
            System.out.println("Enter number ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                sum = number + sum;
                average = Math.floor(sum / count);
                count++;


            }else {
                break;

            }
            scanner.nextLine();


        }
        scanner.close();
        System.out.println("Sum of all numbers is: " + sum);
        System.out.println("Average is: " + average);
    }
}
