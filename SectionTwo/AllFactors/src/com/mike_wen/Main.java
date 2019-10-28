package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        printFactors(10);
    }

    public static void printFactors(int number){
        int factor = 0;
        String line= " ";
        if (number > 1){
            for (int i = 1;i <= number;i++){
                if (number % i == 0){
                    factor = i;
                    System.out.println(factor);

                }
            }
        }else {
            System.out.println("Invalid value");
        }

    }
}
