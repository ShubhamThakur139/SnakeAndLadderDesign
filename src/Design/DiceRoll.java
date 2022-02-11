package Design;

import java.util.Random;
/** This class is used to generate random number between 1 to 6 **/
public class DiceRoll {
    public static int diceRoll(){
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 7;
        int moves = random.nextInt(upperBound-lowerBound) + lowerBound;
        return moves;
    }
}
