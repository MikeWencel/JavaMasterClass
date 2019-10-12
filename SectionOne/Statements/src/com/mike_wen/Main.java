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

            boolean wasCar = isCar ? true : false;
            System.out.println("Was car is " + wasCar);


            int playerLives = 3; // 3
            System.out.println("Player lives = " + playerLives);

        playerLives--; // 2
        System.out.println("playerLives-- = " + playerLives);

        playerLives++; // 3
        System.out.println("playerLives++ = " + playerLives);

        playerLives += --playerLives; // 5
        System.out.println("playerLives += --playerLives = " + playerLives);

        // 6
        System.out.println("++playerLives = " + ++playerLives);
        
//        playerLives = 3;
//        System.out.println("Player lives = " + playerLives);
//


    }


}
