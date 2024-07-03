/**
 * Steelers Fan class
 *
 * @author Samuel Wasserman
 * @author Grant Kazan
 *
 * Purpose: Extends person class for Steelers fans
 */

import java.util.Random;

public class SteelersFan extends Person {

	private String[] answers = {
			"yinz gan dahntahn watch Stillers?",
			"French fries on a sandwich taste good!",
			"here we go steelers here we go CLAP CLAP",
			"here's a number for you: "
	}; 
	
	public SteelersFan(String Name, String Occupation) {
		super(Name, Occupation);
	}
	
	@Override
	public void askQuestion() {
		System.out.println("yinz gon reply to my question");
	}
	
	@Override
	public void answerQuestion() {
	
		Random rand = new Random();
		
		int randInt = rand.nextInt(4);
		
			String ans = answers[randInt];
			
			if (randInt == 3) {
				System.out.println(ans + randInt);
			}
			else {
				System.out.println(ans);
			}
		
		
//		System.out.println("Steelers fan asnwerss a question");
	}
	


}
