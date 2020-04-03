package com.mikewencel;

public class Main {

    public static void main(String[] args) {
	Person person = new Person();
	person.setFirstName("");
	person.setSecondName("");
	person.setAge(10);
		System.out.println("fullName = " + person.getFullName());
		System.out.println("teen = " + person.isTeen());
		person.setFirstName("John");
		person.setAge(18);
		System.out.println("fullName = " + person.getFullName());
		System.out.println("teen = " + person.isTeen());
		person.setSecondName("Smith");
		System.out.println("fullName = " + person.getFullName());
    }
}
