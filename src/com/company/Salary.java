package com.company;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number of hours you work per day: ");
        short workingHoursInDay = input.nextShort();
        int salary = 0;
        if (workingHoursInDay < 0 || workingHoursInDay > 24) {
            System.out.println("Entered value is invalid"); }
        else
            if (workingHoursInDay <= 8) {
                salary = workingHoursInDay * 10;
            }
        else {
                salary = 80 + (workingHoursInDay - 8) * 15;
            }
        System.out.println("Your salary is: " + salary);

    }
}
