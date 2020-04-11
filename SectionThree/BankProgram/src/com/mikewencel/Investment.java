package com.mikewencel;

public class Investment {
    private int percent;
    private double money;

    public String FirstYear(double money,double percent){
        double percentage = money * percent;
        double allMoney = money + percentage;
        String Firstsum = "You invest: " + money +" You earn: " + percentage + " in first year, you had " + allMoney;
        return Firstsum;

    }

    public String secondYear(double money){
        double percentage = money - 1500;
        String sum = "In second year, you lost " + 1500 + " you've got " + percentage ;
        return sum;

    }

    public String thirdYear(double money,double percent){
        money = (percent * money) + money;
        String sum = "In second year, you lost " + percent + " you've got " + money;
        return sum;
    }

}
