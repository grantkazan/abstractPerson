/**
 * Person class
 *
 * @author Grant Kazan
 * @author Samuel Wasserman
 *
 * Purpose: abstract person class has a template for a person.
 * Stores name and occupation as instance variables.
 */

abstract public class Person {
    private String myName;
    private String occupation;

    public Person(String myName, String occupation) {
        this.myName = myName;
        this.occupation = occupation;
    }

    // STATIC???
    // doesn't work it it's static though
    public void askName() {
        System.out.println("What is your name?");
    }

    public void giveName() {
        System.out.println("My name is " + myName);
    }

    public void whatIDo() {
        System.out.println("I am a " + occupation);
    }

    abstract public void askQuestion();

    abstract public void answerQuestion();
}
