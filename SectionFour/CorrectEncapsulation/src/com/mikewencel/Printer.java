package com.mikewencel;

public class Printer {

    private double tonerLevel = 100;
    private int pages;
    private boolean duplexPrinter;

    public Printer(double tonerLevel, int pages, boolean duplexPrinter) {
        if (tonerLevel > 100) {
            tonerLevel = this.tonerLevel;
        }
        pages = this.pages;
        duplexPrinter = this.duplexPrinter;

    }

    public double getTonerLevel() {
        System.out.println("Toner level is " + this.tonerLevel);
        return tonerLevel;
    }

    public int getPages() {
        return pages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public double fillupToner() {
        if (tonerLevel <= 50) {
            System.out.println("Toner level is " + tonerLevel + " refilling toner up to 100%");
        }
        return this.tonerLevel = 100;
    }

    public void printing(int pages){
        for (int i = 0; i < pages; i++) {
            this.tonerLevel = this.tonerLevel - 0.2;
            System.out.println("Toner Level is " + this.tonerLevel);
            if (this.tonerLevel <= 50) {
                fillupToner();
            }
        }
    }

    public int printedPages(int pages, boolean duplexPrinter) {
        if (duplexPrinter) {
            System.out.println("Printing in duplex mode - 'use less paper' ");
            printing(pages);
            System.out.println("You printed " + pages / 2);
            return pages / 2;
        } else {
           printing(pages);
            System.out.println("You printed " + pages);
            return pages;
        }


    }
}


