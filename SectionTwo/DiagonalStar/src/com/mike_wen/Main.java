package com.mike_wen;

public class Main {

    public static void main(String[] args) {
	printSquareStar(15);
    }
    public static void printSquareStar (int number){
        String star = "*";
        String line = " ";
        if (number >= 5){
            for(int i = 1;i <= number;i++){
                for (int j = 1; j <= number;j++){
                    if (i == 1 || j == 1 || i == number || j == number || i == j || j == number - i + 1){
                        System.out.print(star);
                    }else {
                        System.out.print(line);
                    }
                }
                System.out.println();
            }
        }
        System.out.println("Invalid Value");
    }
}
