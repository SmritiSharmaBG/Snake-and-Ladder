package Components;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Dice has numbers from 1 to 6.
 * The game may have 1 or more dice.
 * One roll will roll all the die and return the sum.
 */
public class Dice {
    public static final int DICE_COUNT = 2;
    private int diceCount;

    public Dice() {
        this.diceCount = DICE_COUNT;
    }

    public int rollDice() {
        int total = 0;
        for (int i = 0; i < this.diceCount; i++) {
            total += ThreadLocalRandom.current().nextInt(1, 7);
        }
        return total;
    }
}
