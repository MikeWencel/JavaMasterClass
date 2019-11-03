package com.mike_wen;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner= new Scanner(System.in);


        System.out.println("Enter you year of birth");

        boolean hasNExtInt = scanner.hasNextInt();


        if (hasNExtInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line charater (enter key)

            System.out.println("Enter you name: ");
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;

            if (age < 100 && age > 0) {
                System.out.println("Your name is " + name + " and you're " + age + " years old");
            } else {
                System.out.println(name + " that's impossible, write real date of birth");
            }

            scanner.close();
        }else {
            System.out.println("Try again !!");
        }


    }
}
