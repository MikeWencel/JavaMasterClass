package com.mike_wen;

public class Main {

    public static void main(String[] args) {
    calcFeetAndInchesToCentimeteres(3,0);
    }

    public static double calcFeetAndInchesToCentimeteres(double feet,double inches){
        if ((feet >= 0) && inches >= 0 && inches <= 12 ){
            double newInches = feet * 12;
            newInches = newInches * 2.54;
            System.out.println(newInches + " cm");
        }return -1;
    }

    public static double calcFeetAndInchesToCentimeteres (double inches){
        if (inches >= 0){
            
        }return -1;
    }
}
