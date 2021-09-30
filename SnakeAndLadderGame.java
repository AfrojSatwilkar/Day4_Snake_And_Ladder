package com.company1.SnakeAndLadder;


import java.util.Random;

public class SnakeAndLadderGame {
    public static void main(String[] args) {
        System.out.println("Snake And Ladder Game");
        GameOperations.START_POSITION =0;
        GameOperations GO =new GameOperations();
        GO.roll();
    }
}
