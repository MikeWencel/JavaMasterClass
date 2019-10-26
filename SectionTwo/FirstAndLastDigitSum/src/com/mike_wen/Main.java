package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int num = 0;
        if (number < 0){
            return -1;
        }else {
            while (number > 0){
               num = number % 10;
               number = number / 10;
               sum = num + sum;
               if (sum > 0){
                   while (number > 0){
                       num = number % 10;
                       number = number/ 10;

                   }sum = num + sum;
               }
            }return sum;
        }
    }
}
