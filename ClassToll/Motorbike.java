package ClassToll;

public class Motorbike extends Vehicle{
    public Motorbike () {}

    @Override
    public void payToll() {
        System.out.println("I am a motorbike");
        System.out.println("Paying motorbike toll");
    }
}
