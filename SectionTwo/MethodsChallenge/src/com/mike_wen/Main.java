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
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
    }else if(playerScore >= 100){
        position =3;
        }
        return position;
    }



    public static void displayHighScorePosition(String playerName,int position){
        System.out.println(playerName + " managed to get into position " + position);
    }


}
