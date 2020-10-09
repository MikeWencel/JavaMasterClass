package com.mikewencel;

public class Main {

    public static void main(String[] args) {
    Hamburger hamburger = new Hamburger("Basic","Sausaga",3.56,"White");
    double price = hamburger.itemizeHambuger();
    hamburger.addHamburgerAddition1("Tomato",0.27);
    hamburger.addHamburgerAddition2("Lettuce",0.75);
    hamburger.addHamburgerAddition3("Cheese",1.13);
    System.out.println("Total price of hamburger is: " +  hamburger.itemizeHambuger());


    HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
    healthyBurger.addHamburgerAddition1("Egg", 5.43);
    healthyBurger.addHealthyAddition1("Lentils",3.41);
    System.out.println("Total price of healthy hamburger is: " +  healthyBurger.itemizeHambuger());

    DeluxeBurger db = new DeluxeBurger();
    db.itemizeHambuger();
    db.addHamburgerAddition1("Should not do this",50.53);
    db.itemizeHambuger();


    }
}
