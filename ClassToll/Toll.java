package ClassToll;

public class Toll {
    public Toll () {}

    public void chargeToll (Vehicle v) {
        System.out.println("Charging toll");
        v.payToll();
    }
}
