package ClassToll;

public class Bus extends Vehicle{
    public Bus () {}

    @Override
    public void payToll() {
        System.out.println("I am a bus");
        System.out.println("Paying bus toll");
    }
}
