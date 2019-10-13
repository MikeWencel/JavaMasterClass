package com.mike_wen;

public class Main {

    public static void main(String[] args) {

    areEqualByThreeDecimalPlaces(-3.1756,-3.175);

        int testing = (int) (-3.175 * 1000d);
        System.out.println(testing);
    }

    public static boolean areEqualByThreeDecimalPlaces(double first,double second){
        int firstNumber = (int) (first * 1000d);
        int secondNumber = (int) (second * 1000d);
        if (firstNumber == secondNumber){
            System.out.println(firstNumber + " = " + secondNumber);
            return true;
        }return false;

    }

}
