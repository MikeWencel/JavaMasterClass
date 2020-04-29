package com.mikewencel;

public class Main {

    public static void main(String[] args) {
	Printer homePrinter = new Printer(130,100,false);
	homePrinter.getTonerLevel();
	homePrinter.printedPages(100,false);
        homePrinter.printedPages(150,false);
        homePrinter.getTonerLevel();
	Printer workPrinter = new Printer(200,0,true);
	workPrinter.printedPages(100,true);
	workPrinter.getTonerLevel();
	workPrinter.printedPages(150,true);
	workPrinter.getTonerLevel();
    }
}
