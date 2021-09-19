package com.company;

import java.util.Scanner;

public class DayNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day number: ");
        int day = input.nextInt();
        if (day >= 1 && day <= 31)
            System.out.println("It's January");
        else if (day >= 32 && day <= 59)
            System.out.println("It's February");
        else if (day >= 61 && day <= 90)
            System.out.println("It's March");
        else if (day >= 91 && day <= 120)
            System.out.println("It's April");
        else if (day >= 121 && day <= 151)
            System.out.println("It's May");
        else if (day >= 152 && day <= 181)
            System.out.println("It's June");
        else if (day >= 182 && day <= 212)
            System.out.println("It's July");
        else if (day >= 213 && day <= 243)
            System.out.println("It's August");
        else if (day >= 244 && day <= 273)
            System.out.println("It's September");
        else if (day >= 274 && day <= 304)
            System.out.println("It's October");
        else if (day >= 305 && day <= 334)
            System.out.println("It's November");
        else if (day >= 335 && day <= 365)
            System.out.println("It's December");
        else
            System.out.println("Please choose a day within a short year. Choose a number from 1 to 365");


    }
}
