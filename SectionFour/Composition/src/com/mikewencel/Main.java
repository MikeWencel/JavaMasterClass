package com.mikewencel;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("2200","Dell","240", dimensions);
	    Monitor monitor = new Monitor("21inch Beast","Acer",27, new Resolution(2540,1440));
	    Motherboard motherboard = new Motherboard("BJ-200","Asus",4,2,"v2,44");
	    PC thePc = new PC(theCase,monitor,motherboard);
	    thePc.getMonitor().drawPixelAt(1500,1200,"red");
	    thePc.getMotherboard().loadProgram("Windows 1.0");
		thePc.getTheCase().pressPowerButton();
    }
}
