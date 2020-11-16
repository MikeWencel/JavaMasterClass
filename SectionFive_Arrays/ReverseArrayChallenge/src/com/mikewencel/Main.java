package com.mikewencel;

public class Main {

    public static void main(String[] args) {
    int [] tablica = {1,2,3,4,5};
    printTab(tablica);
    reverse(tablica);
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
}
