package com.company1.SnakeAndLadder;


import java.util.Scanner;

public class SnakeAndLadderGame {
    public static void main(String[] args) {
        System.out.println("Snake And Ladder Game");
        Player1Play P1 = new Player1Play();
        Player2Play P2 = new Player2Play();
        while (Player1Play.PLAYER1_POSITION !=100 && Player2Play.PLAYER2_POSITION !=100){
            Scanner userInput = new Scanner(System.in);
            System.out.println("Player1 It's Your Turn. Enter 1 for Play Move");
            int getPlayer1Input = userInput.nextInt();
            if (getPlayer1Input == 1){
                P1.roll();

            }
            System.out.println("Player2 It's Your Turn. Enter 1 for Play Move");
            int getPlayer2Input = userInput.nextInt();
            if (getPlayer2Input == 1){
                P2.roll();
            }
        }
    }
}