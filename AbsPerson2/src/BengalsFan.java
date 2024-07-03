/**
 * Bengals Fan class
 *
 * @author Samuel Wasserman
 * @author Grant Kazan
 *
 * Purpose: Extends person class for Bengals fans
 */

public class BengalsFan extends Person {
	private String meal;
	
	public BengalsFan(String Name, String Occupation, String meal) {
		super(Name, Occupation);
		this.meal = meal;
	}
	
	public void whatIDo() {
		super.whatIDo();
		System.out.println("I like to eat " + meal + "!");
	}
	
	public void askQuestion() {
		System.out.println( "Do you like to eat " + meal + "?");
	}
	
	public void answerQuestion() {
		System.out.println("513 answers question! food: " + meal);
	}

}
