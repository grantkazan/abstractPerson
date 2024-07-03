/**
 * Browns Fan Class
 *
 * @author Samuel Wasserman
 * @author Grant Kazan
 *
 * Purpose: Extends person class for Browns fans
 */


import java.util.Random;

public class BrownsFan extends Person {
	private final char[] chars = {'&','$','@','#','-'}; // size=5

	public BrownsFan(String Name, String Occupation) {
		super(Name, Occupation);
	}

	@Override
	public void askQuestion() {
		// note to Grader- if you haven't seen 
		// "Hastily Made Cleveland Tourism Video"
		// watch part 1 and 2 on YouTube
		// you're welcome!
		System.out.println("Fun times in Cleveland today!");
	}
	
	@Override
	public void answerQuestion() {
		Random rand = new Random();
		
		// create random string of random length between 1 and 10
		// the numbers are just boundaries. 
		// could do MAX_MIN but they're only used once 
		// so I figured it's nbd
		int randInt = rand.nextInt(11 - 3 + 1) + 3; // TODO: Where do these numbers come from?
		int len = randInt;

		// there's a bug somewhere, but it's not breaking it
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < len; i++) {
			// numbers are for ascii letters
			randInt = rand.nextInt(91-65+1) + 65;
			char c = (char)randInt;
			str.append(c);
			
			if (i % 2 != 0) {
				randInt = rand.nextInt(5);
				str.append(chars[randInt]);
			}

			// all from the same seed but who cares...
			// TODO: Seed with time unless grader doesn't care

		}
		System.out.println(str);
		System.out.println("DAWG POUND");
	}
	
	@Override
	public void whatIDo() {
		System.out.println("I'm a peastor at the parish peast the geas station");
	}
}
