package com.mike_wen;

public class Main {

    public static void main(String[] args) {


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Mike",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Yeison",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Rodney",highScorePosition);


    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }else if ((playerScore) >= 500 && (playerScore < 1000)){
            return 2;
        }else if ((playerScore) >= 100 && (playerScore < 500)){
            return 3;
        }else
            return 4;
    }



    public static void displayHighScorePosition(String playerName,int position){
        System.out.println(playerName + " managed to get into position " + position);
    }


}
