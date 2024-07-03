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
    private String favoritePlayer;

    public ChiefsFan(String myName, String occupation, String favoritePlayer) {
        super(myName, occupation);
        this.favoritePlayer = favoritePlayer;
    }

    @Override
    public void whatIDo() {
        super.whatIDo();
        System.out.println("My favorite player is " + favoritePlayer);
    }

    @Override
    public void askQuestion() {
        System.out.println("Are you from Kansas City Kansas, or Kansas City Missouri?");
    }

    @Override
    public void answerQuestion() {
        Random rand = new Random();
        int randInt = rand.nextInt(3);
        if (randInt == 0) {
            System.out.println("I love Taylor Swift");
        } else {
            System.out.println("I hate Taylor Swift");
        }
    }
}
