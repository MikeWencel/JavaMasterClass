package com.mikewencel;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    Calculator(Floor floor, Carpet carpet) {
        this.carpet = carpet;
        this.floor = floor;
    }

        public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
