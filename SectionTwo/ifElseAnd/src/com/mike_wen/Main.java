package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        

        calculateScore(true,800,5,100);
        calculateScore(true,10000,8,200);


    }

    public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){

            if (gameOver){
                int finalScore = score * bonus;
                finalScore += 1000;
                System.out.println("Your final score was " + finalScore);
            }
        }


}
