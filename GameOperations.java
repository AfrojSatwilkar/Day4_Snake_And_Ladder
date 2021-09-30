package com.company1.SnakeAndLadder;
import java.util.Random;

public class GameOperations {
    public static int START_POSITION, PREVIOUS_POSITION, DICE_NUMBER, COUNT = 0;
    Random num =new Random();
    public void roll() {
        PREVIOUS_POSITION = START_POSITION;
        DICE_NUMBER = num.nextInt(5) + 1;
        COUNT++;
        option();
    }
    public void option(){
        int Option = num.nextInt(2) + 1;
        nextMove(Option);
    }
    public void nextMove(int Option){
        switch (Option){
            case 1 ->
                    //no play
                    System.out.println("No play "+COUNT+" moves And "+START_POSITION+" Location");
            case 2 -> {
                //ladder
                START_POSITION += DICE_NUMBER;
                if (START_POSITION > 100){
                    START_POSITION -= DICE_NUMBER;
                }
                System.out.println(COUNT+" Moves and "+START_POSITION+" Position ");
            }
            case 3 -> {
                //snake
                START_POSITION -= DICE_NUMBER;
                if (START_POSITION <= 0){
                    START_POSITION = 0;
                }
                System.out.println(COUNT+" Moves and "+START_POSITION+" Position ");
            }
        }
        if (START_POSITION != 100){
            roll();
        }
        else{
            System.out.println("Player Won with "+COUNT+" moves");
        }
    }
}