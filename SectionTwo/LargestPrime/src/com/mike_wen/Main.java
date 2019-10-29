package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number){
        int count = 0;
        int i=0;
        int prime = 0;
        if (number > 0){
            while (i < number){
                i++;
                if ((number % i == 0) && (number > i)){
                    if (i < number){
                        prime = i;
                    }



                }
            }return prime;
        }return -1;
    }
}
