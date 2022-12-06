package ClassToll;

public class Car extends Vehicle{
    public Car () {}

    @Override
    public void payToll() {
        System.out.println("I am a car");
        System.out.println("Paying car toll");
    }
}
