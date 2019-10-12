package com.mike_wen;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It's not an alien! ");
            else{
            System.out.println("It's an alien!");
        }

        int topScore = 80;
            if (topScore == 100){
                System.out.println("You got the high score!");
            }

        int secondTopScore = 60;
            if (topScore > secondTopScore && topScore < 100) {
                System.out.println("Greater then second top score and less then 100");
            }

            if ((topScore > 70) || (secondTopScore <= 60)){
                System.out.println("Eater or both condition are true");
            }

        boolean isCar = true;
            if (isCar){
                System.out.println("It's true");
            }

    }


}
