package com.mike_wen;

public class Main {

    public static void main(String[] args) {

    float minFloatValue = Float.MIN_VALUE;
    float maxFloatValue = Float.MAX_VALUE;

    System.out.println("Float minimum value = " + minFloatValue);
    System.out.println("Float maximum value = " + maxFloatValue);

    double minDoubleValue = Double.MIN_VALUE;
    double maxDoubleValue = Double.MAX_VALUE;

    System.out.println("Double minimum value = " + minDoubleValue);
    System.out.println("Double maximum value = " + maxDoubleValue);

    int myIntValue = 5;

    //numbers in float are treated literaly as double, so we must use casting. Better now to use is "double"
    float myFloatValue = (float) 5;
    double myDoubleValue = 5;

    int dividedInt = myIntValue / 3;
    float dividedFloat = myFloatValue / 3f;
    double dividedDouble = myDoubleValue / 3d;

        System.out.println("myIntValue / 2 =" + dividedInt);
        System.out.println("myFloatValue / 2 = " + dividedFloat);
        System.out.println("myDoubleValue / 2 = " + dividedDouble);


    //Challenge pounds to kilogram


    double pound = 0.45359237;
    double kilograms = 50;
    double convertedPounds = kilograms * pound;

        System.out.println(kilograms + " kilograms is " + convertedPounds + "Pounds");

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * pound;

        System.out.println("Converted kilograms is " + convertedKilograms);



    }
}
