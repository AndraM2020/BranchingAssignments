package com.company;

import java.time.YearMonth;
import java.util.Scanner;

public class DayNumberAlt {
    public static void main(String[] args) {
        Scanner inputMonth = new Scanner(System.in);
        System.out.println("Please enter a month number: ");
        int month = inputMonth.nextInt();
        Scanner inputYear = new Scanner(System.in);
        System.out.println("Please enter a Year: ");
        int year = inputYear.nextInt();
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println("Number of days: " + daysInMonth);

    }
}
