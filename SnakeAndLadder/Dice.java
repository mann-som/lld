package SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    
    int diceCnt;
    int min = 1;
    int max = 6;

    public Dice(int diceCnt){
        this.diceCnt = diceCnt;
    }

    public int rollDice(){
        int diceUsed = 0;
        int total = 0;
        while(diceUsed < diceCnt){
            total += ThreadLocalRandom.current().nextInt(min, max+1);
        }

        return total;
    }
}
