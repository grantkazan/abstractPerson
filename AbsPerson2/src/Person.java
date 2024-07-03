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
