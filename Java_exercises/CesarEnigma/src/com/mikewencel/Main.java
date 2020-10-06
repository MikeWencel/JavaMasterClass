package com.mikewencel;

public class Main {

    public static void main(String[] args) {

        char c;


        int i = 0;
        for (c = 'A'; c <= 'Z'; ++c) {
            System.out.println(c + " ");
            i++;
        }

        System.out.println(i);

        char[]alphabet = new char [i];
        int j = 0;
        for (c = 'A'; c <= 'Z'; ++c) {
            alphabet[j] = c;
            j++;
        }

        System.out.println(alphabet[1]);






    }
}
