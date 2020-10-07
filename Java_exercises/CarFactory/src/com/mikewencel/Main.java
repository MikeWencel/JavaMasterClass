package com.mikewencel;

public class Main {

    public static void main(String[] args) {
	Car s1 = new Car();
	s1.writeInfo();
	s1.setMark("Skoda");
	s1.setModel("SuperB");
	s1.setDoors(5);
	s1.setCapacity(2000);
	s1.setAvgBurn(7.2);
	System.out.println("********************");
	s1.writeInfo();

	Car s2 = new Car();
	double tripCost = s2.travelCost(30.5,4.85);
        System.out.println("Koszt przejazdu " + tripCost);
    s2.carInfoAmount();
    }
}
