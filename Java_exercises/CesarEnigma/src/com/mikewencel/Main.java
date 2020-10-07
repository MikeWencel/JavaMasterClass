package com.mikewencel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        scanner.close();
        String upperText = text.toUpperCase();

        char newText[] = upperText.toCharArray();


        for(int i = 0;i < newText.length;i++){
            int num = newText[i];
            num = num + 3;
            if(num == 35){
                num = 32;
            }
            if((char)num > 'Z'){
                num = num - 26;
            }




            newText[i] = (char) num;

        }
        System.out.println(newText);
    }
}
