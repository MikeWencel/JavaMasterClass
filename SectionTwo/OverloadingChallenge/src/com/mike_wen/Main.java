package com.mike_wen;

public class Main {

    public static void main(String[] args) {
    calcFeetAndInchesToCentimeteres(157);
    }

    public static double calcFeetAndInchesToCentimeteres(double feet,double inches){
        if ((feet >= 0) && inches >= 0 && inches <= 12 ){
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet " + inches + " inches " + centimeters + " cm");
            return centimeters;
        }
        System.out.println("Invalid parameter");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeteres (double inches){
        if (inches >= 0){
        double feet = (int) inches/12;
        double remainderInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " ft " + remainderInches + " inches");
        return calcFeetAndInchesToCentimeteres(feet,remainderInches);
        }return -1;
    }
}
