package com.mike_wen;

public class Main {

    public static void main(String[] args) {
	String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        // Metoda parseInt zmienia String w In
        // Pojawiła się również nazwa metody, stąd duża litera.

        int number = Integer.parseInt(numberAsString);
        System.out.println("numberAsString + numberAsString = " + number + number);

        double second = Double.parseDouble(numberAsString);
        System.out.println("This is a double, it was string before = "  + second);
        second ++;
        System.out.println("This is a double, it was string before + 1 = "  + second);
        String numbers = "1234";
        System.out.println("This is new double + String as number 1234 result is " + second + numbers);


            }
}
