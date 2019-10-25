package com.mike_wen;

public class Main {

    public static void main(String[] args) {
	sumDigits(123);
    }

    public static int sumDigits(int number){
        int numbers = number;
        int n = 0;
        int sum = 0;
        if (number >= 10){

            while (number / 10 != 0){
                n = number % 10;
                sum = n + sum;
                number = number / 10;
                if(number < 10) {
                    sum = number + sum;
                }
            }
            System.out.println("SUM OF NUMBER: " + numbers + " is " + sum);

        }else {


        }return -1;
    }
}
