package com.mikewencel;

public class Furnitures {

    private int desk;
    private int bookcase;
    private int chair;
    private int bed;

    public Furnitures(int desk, int bookcase, int chair, int bed) {
        this.desk = desk;
        this.bookcase = bookcase;
        this.chair = chair;
        this.bed = bed;
    }

    public void allFurnitures(int desk, int bookcase, int chair, int bed){
        int sum = desk + bookcase +chair+bed;
        System.out.println("In this room we've got " + sum);
    }


}
