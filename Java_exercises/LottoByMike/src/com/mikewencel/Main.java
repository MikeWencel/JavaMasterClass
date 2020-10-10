package com.mikewencel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int []numbers = new int[50];

	for (int i = 1; i < numbers.length;i++){
	    numbers[i] = i;

        System.out.println(numbers[i]);
    }

    int[] result = new int[6];
	for (int i = 0; i < 6;i++){
	    int r = (int) (Math.random() * 49);
	    result[i] = numbers[r];
    }

    Arrays.sort(result);
	for (int element : result){
        System.out.println(element);
    }



    }
}
