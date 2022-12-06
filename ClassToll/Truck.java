package ClassToll;

public class Truck extends Vehicle{
    public Truck () {}

    @Override
    public void payToll() {
        System.out.println("I am a truck");
        System.out.println("Paying truck toll");
    }
}
