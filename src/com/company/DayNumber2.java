package com.company;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class DayNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int year = input.nextInt();
        System.out.println("Please enter a day number:");
        int dayNumber = input.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.DAY_OF_YEAR, dayNumber);
        System.out.println("It is: " + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH));

    }
}
