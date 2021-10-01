package com.company1.SnakeAndLadder;

import java.util.Random;
import java.util.Scanner;

public class Player2Play {
    public static int PLAYER2_POSITION =0, PREVIOUS_POSITION_PLAYER2, DICE_NUMBER,
            COUNT_PLAYER2 = 0;
    Random num =new Random();
    Scanner player2 =new Scanner(System.in);
    public void roll() {
        PREVIOUS_POSITION_PLAYER2 = PLAYER2_POSITION;
        DICE_NUMBER = num.nextInt(6) + 1;
        COUNT_PLAYER2++;
        option();
    }
    public void option(){
        int Option = num.nextInt(3) + 1;
        player2Move(Option);
    }
    public void player2Move(int Option){
        switch (Option){
            case 1 ->
                    //no play
                    System.out.println("No play "+COUNT_PLAYER2+" moves And "+PLAYER2_POSITION+" Location");
            case 2 -> {
                //ladder
                PLAYER2_POSITION += DICE_NUMBER;
                if (PLAYER2_POSITION > 100){
                    PLAYER2_POSITION -= DICE_NUMBER;
                    System.out.println(COUNT_PLAYER2+" Moves and "+PLAYER2_POSITION+" Position ");
                }
                else if (PLAYER2_POSITION == 100){
                    System.out.println("Player2 win the game with "+COUNT_PLAYER2+" moves");
                }
                else{
                    System.out.println(COUNT_PLAYER2+" Moves and "+PLAYER2_POSITION+" Position ");
                    System.out.println("Got Ladder Player2 Play again");
                    int playAgain = player2.nextInt();
                    if (playAgain==1){
                        roll();
                    }
                }
            }
            case 3 -> {
                //snake
                PLAYER2_POSITION -= DICE_NUMBER;
                if (PLAYER2_POSITION <= 0){
                    PLAYER2_POSITION = 0;
                }
                System.out.println(COUNT_PLAYER2+" Moves Snake bite "+PLAYER2_POSITION+" Position ");
            }
        }

    }
}
