package com.company;

import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 800, levelCompleted, bonus);

       highScore = calculateScore(true, 10000, 8, 200);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("tim", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("bob", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("fred", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("jim", position);
        }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
            return -1;
    }

    public static void displayHighScorePosition(String playerName, int position ) {

        System.out.println(playerName + "  managed to get into position  " +
                position + "  on the high score table  "
                );
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000) {
            return  1;
        }else if(playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if(playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }

    }
}
