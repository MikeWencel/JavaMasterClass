package com.mike_wen;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your year of birth");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // After scanning number, always we must write nexLine, to handle of working scanner


            System.out.println("Enter your name: ");
            String name = scanner.nextLine();


            int year = 2020;
            int ageOfTheUser = year - yearOfBirth;
            if (ageOfTheUser >= 0 && ageOfTheUser <= 100){
                System.out.println("Your name is " + name + " and you are " + ageOfTheUser + " years old!");
            }else {
                System.out.println("Ivalid year of birth");
            }
        }else {
            System.out.println("This isn't correct datatype");
        }






        scanner.close();

    }
}
