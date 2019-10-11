package com.mike_wen;

public class Main {

    public static void main(String[] args) {

        int myFirstNumber = 5 + 2 * 3;
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        System.out.println(myFirstNumber);

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum Value = " + myMinIntValue);
        System.out.println("Integer maximum Value = " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte mininum Value = " + myMinByteValue);
        System.out.println("Byte maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short mininum Value = " + myMinShortValue);
        System.out.println("Short maximum Value = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long mininum Value = " + myMinLongValue);
        System.out.println("Long maximum Value = " + myMaxLongValue);

        // Casting - converting types

        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);
        //Casting says - This is a byte, so convert to byte
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        System.out.println(myNewByteValue);
    }

}
