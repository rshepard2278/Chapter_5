import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class RandomTester here.
 * 
 * @author Richard Shepard
 * @version 2.12.2015
 */
public class RandomTester
{
    Random rand;
    ArrayList<String> responses;
   
    public RandomTester() {
      rand = new Random();
      responses = new ArrayList<>();
      responses.add("yes");
      responses.add("no");
      responses.add("maybe");
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
    
    public String getResponse() {
        String returnVal = responses.get(rand.nextInt(3));
        System.out.println(returnVal);
        return returnVal;
    }

    public int getRandMax(int max) {
        return getHiLoMax(max, 0);
    }

    public int getHiLoMax(int max, int min) {
        int range = max - min;
        int random = rand.nextInt(range);
        random += min;
        return random;
    }
}
