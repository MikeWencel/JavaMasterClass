package com.mikewencel;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("Write number that need to be multiplicaten");
	int number = scanner.nextInt();

	for (int i = 1;i <= 10;i++){
        System.out.println(i + " * " + number + " = " + i  * number);
    }
    scanner.close();
    }
}
