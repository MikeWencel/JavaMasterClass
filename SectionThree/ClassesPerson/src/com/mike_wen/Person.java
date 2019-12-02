package com.mike_wen;

public class Person {
    public String firstName;
    public String lastName;
    public int age;


    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 100 || age < 0){
            age = 0;
        }
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen(){
        if(age < 12 || age > 20){
            return false;
        }else {
            return true;
        }
    }

    public String getFullName (){
        String fullName = firstName + " " + lastName;
        if (firstName.isEmpty()&& lastName.isEmpty()){
            return " ";
        }else if(lastName.isEmpty()){
            return firstName;
        }else if(firstName.isEmpty()){
            return lastName;
        }else return fullName;
    }
}
