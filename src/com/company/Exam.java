package com.company;


import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grade in the following format: A,B,C,D,E or F: ");
        char grade = scanner.next().charAt(0);
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Perfect! Your the master of the Universe");
                break;
            case 'C':
                System.out.println("Good! But you can aim higher!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! Go study some more!");
                break;
            case 'F':
                System.out.println("Fail! This is so bad it's embarrassing!");
                break;
            default:
                System.out.println("Please enter valid range (A,B,C,D,E or F)");
        }
    }
}
