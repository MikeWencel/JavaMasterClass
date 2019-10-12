package com.mike_wen;

public class Main {

    public static void main(String[] args) {
	double myDouble = 20.00d;
	double mySecondDouble = 80.00d;
	double totalDouble = myDouble + mySecondDouble;
        System.out.println("20.00 + 80.00 = " + totalDouble);

        double reminderTotal = totalDouble % 40.00d * 100.00d;
        System.out.println("Reminder 40.00 = " + reminderTotal);
    boolean isNoReminder = (reminderTotal == 0) ? true : false;
        System.out.println("isRemainder " + isNoReminder);

    if (reminderTotal == 0) {
        System.out.println("Reminder is true");
    }else {
        System.out.println("Reminder is false");
    }

    if (!isNoReminder){
        System.out.println("Got remainder");
    }




    }
}
