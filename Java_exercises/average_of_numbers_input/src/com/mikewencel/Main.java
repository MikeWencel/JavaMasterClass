package com.mikewencel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Give me three numbers and java will math the average of these numbers :)");

        double firstNum = scanner.nextInt();
        double secondNum = scanner.nextInt();
        double thirdNum = scanner.nextInt();
    Math averages = new Math(firstNum,secondNum,thirdNum);

    scanner.close();

    averages.writeAverage();
    }


}
