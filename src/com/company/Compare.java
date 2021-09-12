package com.company;

import javax.swing.*;

public class Compare {

    public static void main(String[] args) {
        short numberOne = 10;
        short numberTwo = 11;

        if (numberOne == numberTwo) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }

        if (numberOne > numberTwo) {
            System.out.println("Number One is larger than number Two");
        } else {
            System.out.println("Number Two is larger than number One");
        }
        if (numberOne % 2 == 0) {
            System.out.println("Number One is uneven");
        } else {
            System.out.println("Number One is odd");
        }
        if (numberTwo % 2 == 0) {
            System.out.println("Number Two is uneven");
        } else {
            System.out.println("Number Two is odd");
        }
        if (numberOne > 0) {
            System.out.println("Number One is positive");
        } else {
            System.out.println("Number One is negative");
        }
        if (numberTwo > 0) {
            System.out.println("Number Two is positive");
        } else {
            System.out.println("Number Two is negative");
        }
        if (numberOne < 100) {
            System.out.println("Number One is less than 100");
        }
        if (numberTwo < 100) {
            System.out.println("Number Two is less than 100");
        }

    }
}
