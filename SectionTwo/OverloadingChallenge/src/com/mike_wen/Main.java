package com.mike_wen;

public class Main {

    public static void main(String[] args) {
    calcFeetAndInchesToCentimeteres(3,4);
    }

    public static double calcFeetAndInchesToCentimeteres(double feet,double inches){
        if ((feet >= 0) && inches >= 0 && inches <= 12 ){
            double centimeters = (feet * 12) * 2.54;
            double secNewInches = inches * 2.54;
            System.out.println(centimeters + secNewInches + " cm");
        }return -1;
    }

    public static double calcFeetAndInchesToCentimeteres (double inches){
        if (inches >= 0){
        double feets = inches/12;
            System.out.println("Feets = " + feets);
        }return -1;
    }
}
