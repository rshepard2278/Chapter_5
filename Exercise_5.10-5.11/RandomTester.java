import java.util.Random;
/**
 * Write a description of class RandomTester here.
 * 
 * @author Richard Shepard
 * @version 2.12.2015
 */
public class RandomTester
{
    Random rand;
   
    public RandomTester() {
      rand = new Random();
    }

    public void printOneRandom() {
        System.out.println(rand.nextInt());
    }

    public void printMulitRandon(int amount) {
        for(int i = 0; i < amount; i++) {
            System.out.println(rand.nextInt());
        }
    }

    public void throwDice() {
        System.out.println(rand.nextInt(6) + 1);
    }
}
