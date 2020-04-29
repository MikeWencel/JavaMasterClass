package com.mikewencel;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Knife";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());

        EnhancedTplayer player = new EnhancedTplayer("Mike",200,"Knife");
        System.out.println("Initial health is " + player.getHealth());
    }


}

