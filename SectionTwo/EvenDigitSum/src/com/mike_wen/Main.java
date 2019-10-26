package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        int num;
        int even;
        int sum = 0;
        if (number < 0){
            return -1;
        }else {
            while (number > 0){
                num = number % 10;
                if (num % 2 == 0){
                    even = num;
                    sum = even + sum;
                }
                number = number / 10;
            }

            }return sum;
        }
    }

