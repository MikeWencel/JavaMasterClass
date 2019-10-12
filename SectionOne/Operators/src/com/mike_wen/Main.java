package com.mike_wen;

public class Main {

    public static void main(String[] args) {
    int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        result = result - 2; // 1
        System.out.println("3 - 2 = " + result);
        result = result * 10;
        System.out.println("1 * 10 = " + result);
        result = result / 2;
        System.out.println("10 / 2 = " + result);
        result = result % 3;
        System.out.println("5 % 3 = " + result);

        result++; // 3
        System.out.println("2 + 1 = " + result);

        result--; // 2
        System.out.println("4 - 2  = " + result);

        result *= 10; //20
        System.out.println("2 * 10 = " + result);

        result /= 2;
        System.out.println("20 / 2 = " + result);

        result -= 8;
        System.out.println("10 - 8 = " + result);
    }
}
