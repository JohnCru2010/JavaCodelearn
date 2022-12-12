package InterfaceClass;

public class Motorbike implements Vehicle{
    private int speed;
    private String model;
    private int engineCapacity;

    public Motorbike (int engineCapacity, String model) {
        this.speed = 0;
        this.engineCapacity = engineCapacity;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String slowDown (int quantity) {
        if (this.speed - quantity > 0) {
            this.speed -= quantity;
            return "The motorbike has slowed down and its current speed is " + this.speed + "Km / h.";
        } else {
            this.speed = 0;
            return "The motorbike  has slowed down and its current speed is " + this.speed + "Km / h.";
        }
    }

    public String speedUp (int quantity) {
        if (this.speed + quantity <= maxSpeed) {
            this.speed += quantity;
            return "The motorbike has speed up and its current speed is " + this.speed + "Km / h.";
        } else {
            this.speed = maxSpeed;
            return "The motorbike has speed up and its current speed is " + this.speed + "Km / h.";
        }
    }

}