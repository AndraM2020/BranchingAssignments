package com.company;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        System.out.println("Please enter a second number: ");
        int num1 = input.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a letter where: " +
                " a = sum both numbers " +
                " b = subtraction both numbers" +
                " c = division of both numbers " +
                " d = multiplication of both numbers " +
                " e = a remainder of the division of both numbers " +
                " f = print out of both numbers " +
                " g = verification of the bigger number " +
                " h = verification of the smaller number ");
        int theResult = scanner.next().charAt(0);
        switch (theResult) {
            case 'a':
                System.out.println("The sum of both numbers is " + (num + num1));
            case 'b':
                System.out.println("Substraction of both numbers is " + (num - num1));
            case 'c':
                System.out.println("Division of both numbers is " + (num / num1));
                break;
            case 'e':
                System.out.println("The reminder of the division of both numbers is " + (num % num1));
                break;
            case 'f':
                System.out.println("The numbers you chose are " + num + " and " + num1);
                break;
            case 'g':
                if (num > num1) {
                    System.out.println(num + " is bigger than " + num1);
                }else {
                    System.out.println(num1 + "is bigger than " + num);
                }
                break;
            case 'h':
                if (num < num1) {
                    System.out.println(num + " is smaller than " + num1);
                }else {
                    System.out.println(num1 + " is smaller than " + num);
                }
                break;
            default:
                System.out.println("Something went wrong!");

        }
    }
}
