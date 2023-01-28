package com.Java.snakeladder;

public class SnakeLadder {
    public static void main(String[] args) {
        int singlePlayerValue = 0;
        int player = 0;
        int dice = 1 + (int) (Math.random() * 6);
        System.out.println("initial playerPosition: " + player);
        player = player + dice;
        String option = "" + player;
        if (option == "No play") {
            System.out.println("PLAYER POSITION IS SAME");
        } else if (option == "Ladder") {
            player = player + 10;
        } else if (option == "Snake") {
            player = player - 10;
        }
        System.out.println(option + dice);
    }
}
