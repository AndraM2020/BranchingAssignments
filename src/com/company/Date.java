package com.company;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write the day: ");
        int day = input.nextInt();
        if (day <= 0 || day >= 31) {
            System.out.println("Invalid values! Please enter day from 1 to 31!");
        }
        System.out.println("Please write the month: ");
        int month = input.nextInt();
        if (month <= 0 || month >= 12) {
            System.out.println("Invalid values! Please enter month from 1 to 12!");
        }

        System.out.println("Please write the year:");
        int year = input.nextInt();
        if (year <= 0 || year > 2222) {
            System.out.println("Invalid values! Please enter year again!");
        } else {
            System.out.println("Please select the date formating. 1 - YYYY/MM/DD, 2 - YYYY.MM.DD");
            int format = input.nextInt();
            if (format == 1) {
                System.out.println("Your date is" + " " + year + "/" + month + "/" + day);
            }

            if (format == 2) {
                System.out.println("Your date is" + " " + year + "." + month + "." + day);
            }


        }
    }
}