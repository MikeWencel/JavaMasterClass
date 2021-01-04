package com.wencelmichael;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;
        while (count < num){
        String str = scanner.next();
        String[] edges = str.split(",");

        String tempOne = edges[0];
        String tempTwo = edges[1];

        String []tempNewOne = tempOne.split("=");
        String []tempNewTwo = tempTwo.split("=");
        int n = Integer.parseInt(tempNewOne[1]);
        int m = Integer.parseInt(tempNewTwo[1]);


        String graphList = scanner.next();
        String[]temptab = new String[m];
        String[]temp = graphList.split(" ");



            count++;
        }
    }
}
