package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000,2.0));
        System.out.println(isPrime(4));
        allPrimes(2,40);



    }

    public static double calculateInterest(double amount, double interestRate){
        double value = (amount * (interestRate / 100));
        for (int i = 0;i <= 8;i++){
            interestRate = i;
            System.out.println("10,000 at " + i + ".0% interest = " +  Math.floor(amount * (interestRate/100)));
        }

        return value;
    }


    public static boolean isPrime (int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2;i <= n-1;i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void allPrimes (int first, int second) {
        for (int i = first;i<=second;i++){
            if (isPrime(i)){
                System.out.println(i + " is a prime number");
            }
        }
    }
}
