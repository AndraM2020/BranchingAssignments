package com.company;

public class HighScorePosition {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("John", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Ted", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Sam", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Dany", highScorePosition);
    }

    public static void displayHighScorePosition(String name, int highScorePosition) {
        System.out.println(name + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
