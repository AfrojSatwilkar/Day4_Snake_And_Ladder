package com.company1.SnakeAndLadder;
import java.util.Random;

public class GameOperations {
    public static int START_POSITION ,PREVIOUS_POSITION ,COUNT=0;

    public static void roll(){
        PREVIOUS_POSITION = START_POSITION;
        Random num = new Random();
        START_POSITION = num.nextInt(5)+1;
    }
}
