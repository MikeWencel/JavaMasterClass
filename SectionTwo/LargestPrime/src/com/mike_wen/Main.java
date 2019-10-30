package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number){
        int count = 0;
        int i=1;
        int prime = 0;
        if (number > 0){
            while (i < number){
                i++;
                if (i == number){
                    break;
                }
                if (number % i == 0){
                    prime = number / i;

                }
            }return prime;
        }return -1;
    }
}
