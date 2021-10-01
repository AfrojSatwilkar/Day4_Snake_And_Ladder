package com.company1.SnakeAndLadder;
import java.util.Random;
import java.util.Scanner;

public class Player1Play {
    public static int PLAYER1_POSITION =0, PREVIOUS_POSITION_PLAYER1, DICE_NUMBER,
            COUNT_PLAYER1 = 0;
    Random num =new Random();
    Scanner player1 = new Scanner(System.in);
    public void roll() {
        PREVIOUS_POSITION_PLAYER1 = PLAYER1_POSITION;
        DICE_NUMBER = num.nextInt(6) + 1;
        COUNT_PLAYER1++;
        option();
    }
    public void option(){
        int Option = (num.nextInt(3) + 1);
        player1Move(Option);
    }
    public void player1Move(int Option){
        switch (Option){
            case 1 ->
                    //no play
                    System.out.println("No play "+COUNT_PLAYER1+" moves And "+PLAYER1_POSITION+" Location");
            case 2 -> {
                //ladder
                PLAYER1_POSITION += DICE_NUMBER;

                if (PLAYER1_POSITION > 100){
                    PLAYER1_POSITION -= DICE_NUMBER;
                    System.out.println(COUNT_PLAYER1+" Moves and "+PLAYER1_POSITION+" Position ");
                }
                else if (PLAYER1_POSITION == 100){
                    System.out.println("Player1 win the game with "+COUNT_PLAYER1+" moves");
                    break;
                }
                else{
                    System.out.println(COUNT_PLAYER1+" Moves and "+PLAYER1_POSITION+" Position ");
                    System.out.println("Got Ladder Player1 Play again");
                    int playAgain = player1.nextInt();
                    if (playAgain==1){
                        roll();
                    }
                }
            }
            case 3 -> {
                //snake
                PLAYER1_POSITION -= DICE_NUMBER;
                if (PLAYER1_POSITION <= 0){
                    PLAYER1_POSITION = 0;
                }
                System.out.println(COUNT_PLAYER1+" Moves Snake bite "+PLAYER1_POSITION+" Position ");
            }
        }

    }
}