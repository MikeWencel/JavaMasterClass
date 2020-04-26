package com.mikewencel;

public class Main {

    public static void main(String[] args) {
        Furnitures furnitures = new Furnitures(1,2,2,1);
        Size size = new Size(2,4,2);
        Items items = new Items("Yes",2,4,2);
        Room theNewRoom = new Room(size,furnitures,items);
        theNewRoom.openTheDoor();
    }
}
