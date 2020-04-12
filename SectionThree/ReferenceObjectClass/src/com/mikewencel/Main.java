package com.mikewencel;

public class Main {

    public static void main(String[] args) {

        // Reference
	House blueHouse = new House("blue");
        // Reference to the same object in memory ---> House
	House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());


        // The same color, cause we've got references
        anotherHouse.setColor("yellow");
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor());
        System.out.println(greenHouse.getColor());
        System.out.println(anotherHouse.getColor());



    }
}
