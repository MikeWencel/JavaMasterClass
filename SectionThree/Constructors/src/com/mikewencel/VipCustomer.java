package com.mikewencel;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private  String email;

    public VipCustomer (){
        this("Default Name",0,"deafult@mail.com");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "unknown@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
