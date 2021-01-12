package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> fruits = new LinkedList<String>();
        fruits.add("Orange");
        System.out.println(fruits);

        fruits.add("Banana");

        System.out.println(fruits);

        fruits.toArray();

        for (String el: fruits
             ) {
            System.out.print(el);
            System.out.print(" ");
        }


    }
}
