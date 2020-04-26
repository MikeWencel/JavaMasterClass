package com.mikewencel;

public class Room {
    Size size;
    Furnitures furnitures;
    Items items;

    public Room(Size size, Furnitures furnitures, Items items) {
        this.size = size;
        this.furnitures = furnitures;
        this.items = items;
    }

    public void openTheDoor(){
        size.sizeOfRoom();
        lightsOn();
    }

    private void lightsOn(){
    items.lightsOnNow();
    }
}
