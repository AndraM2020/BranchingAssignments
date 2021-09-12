package com.company;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        short time = -2;
        if (time < 12 && time >0) {
            System.out.println("Good Morning Sunshine!");
        }
        if (time >= 13 && time <= 19) {
            System.out.println("Good Afternoon! Work Hard!");
        }
        if (time >= 20 && time <= 24) {
            System.out.println("Good Evening! Get some rest!");
        }
        if (time < 0 || time > 24)
        {
            System.out.println("Please choose value in 24 hour time format");}

    }
}
