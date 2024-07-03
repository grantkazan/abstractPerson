import java.util.Random;

/**
 * Chiefs Fan Class
 *
 * @author Samuel Wasserman
 * @author Grant Kazan
 *
 * Purpose: Extends person class for Chiefs fans
 */

public class ChiefsFan extends Person {
    private String FavoritePlayer;

    public ChiefsFan(String myName, String occupation) {
        super(myName, occupation);
    }

    @Override
    public void whatIDo() {
        super.whatIDo();
        System.out.println("I love Andy Reid!");
    }

    @Override
    public void askQuestion() {
        System.out.println("Are you from Kansas or Missouri?");
    }

    @Override
    public void answerQuestion() {
        Random rand = new Random();
        int randInt = rand.nextInt(2);
        if (randInt == 0) {
            System.out.println("I love Taylor Swift");
        } else {
            System.out.println("I hate Taylor Swift");
        }
    }
}
