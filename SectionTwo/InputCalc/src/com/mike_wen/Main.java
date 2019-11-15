package com.mike_wen;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number;
        int sum = 0;

        while (true){
            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                number = scanner.nextInt();
                sum = number + sum;
            }else{
                break;
            }
            scanner.nextLine();

        }
        scanner.close();
    }
}
