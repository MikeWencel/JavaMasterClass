package com.mikewencel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    int [] tablica = {1,2,3,4,5};

    printTab(tablica);
    reverseSecond(tablica);

        System.out.println("Array reversed in second version = " + Arrays.toString(tablica));
    }

    static void reverse(int array[]){

        int [] tab = new int [array.length];
        int count = 0;
    for(int i = array.length-1; i >= 0;i--){
        tab[count] = array[i];
        count++;
    }
        for (int el: tab
             ) {
            System.out.println(el);
        }
    }

    static void printTab(int array[]){
        for (int el: array
             ) {
            System.out.println(el);
        }
    }

    static void reverseSecond(int[] array) {
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength;i++){
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
    }

}
