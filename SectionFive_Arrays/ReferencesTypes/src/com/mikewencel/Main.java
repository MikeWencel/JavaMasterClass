package com.mikewencel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    int a = 10;
    int b = a;

        System.out.println("My int value 'a' = " +  a);
        System.out.println("My int value 'b' = " +  b);
    a++;

        System.out.println("My int value 'a' = " +  a);
        System.out.println("My int value 'b' = " +  b);

    int myArray[] = new int [5];
    int secondArray[] = myArray;

        System.out.println("My value of 'myArray' = " + Arrays.toString(myArray));
        System.out.println("My value of 'secondArray' = " + Arrays.toString(secondArray));

    secondArray[0] = 2;

        System.out.println("My value of 'myArray' = " + Arrays.toString(myArray));
        System.out.println("My value of 'secondArray' = " + Arrays.toString(secondArray));

    modify(secondArray);

        System.out.println("Modify of 'myArray' = " + Arrays.toString(myArray));
        System.out.println("Modify of 'secondArray' = " + Arrays.toString(secondArray));

    }

    private static void modify(int array[]){
        array[0] = 3;
    }
}
