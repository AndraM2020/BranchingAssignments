package com.company;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which day is it? ");
        int dayOfTheWeek = input.nextInt();
        switch (dayOfTheWeek) {
            case 1:
                case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It's a working day!");
                break;
            case 6:
            case 7:
                System.out.println("It's a holiday!");
                break;
            default:
                System.out.println("Please enter a valid range (1-7)");
        }
    }
}
