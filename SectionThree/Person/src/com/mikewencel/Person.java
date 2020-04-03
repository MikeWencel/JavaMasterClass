package com.mikewencel;

public class Person {
    private String firstName;
    private String secondName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public void setAge(int age){
        if (age < 0 || age > 105){
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public boolean isTeen(){
        if (age > 12 && age < 20){
            return true;
        }else {
            return false;
        }
    }

    public String getFullName(){
        if (firstName.equals("") && secondName.equals("")){
            return "";
        }else if(secondName.equals("")){
            return firstName;
        }else if (firstName.equals("")){
            return secondName;
        }else return firstName + " " + secondName;
    }


}
