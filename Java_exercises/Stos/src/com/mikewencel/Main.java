package com.mikewencel;

import java.lang.*;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        char s = ' ';
        int [] tab = new int [10];



        while (scanner.hasNext()){
            s = scanner.next().charAt(0);
            int ascii = s;
            if(ascii == 13){
                scanner.close();
            }else {
                if (s == '+') {
                    if (i < 10) {
                        tab[i] = scanner.nextInt();
                        System.out.println(":)");
                        i++;
                    } else {
                        System.out.println(":(");
                    }
                } else if (s == '-') {
                    if (i <= 10 && i > 0) {
                        System.out.println(tab[i - 1]);
                        tab[i - 1] = 0;
                        i--;

                    } else {
                        System.out.println(":(");
                    }
                }

            }
        }
    }
}