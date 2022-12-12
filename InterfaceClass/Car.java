package InterfaceClass;

public class Car implements Vehicle {
    private int speed;
    private String type;
    private String model;
    private int power;

    public Car (String type, String model, int power) {
        this.speed = 0;
        this.type = type;
        this.model = model;
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }
   
    public void setPower(int power) {
        this.power = power;
    }


    public String slowDown (int quantity) {
        if (this.speed - quantity > 0) {
            this.speed -= quantity;
            return "The car has slowed down and its current speed is " + this.speed + "Km / h.";
        } else {
            this.speed = 0;
            return "The car has slowed down and its current speed is " + this.speed + "Km / h.";
        }
    }

    public String speedUp (int quantity) {
        if (this.speed + quantity <= maxSpeed) {
            this.speed += quantity;
            return "The car has speed up and its current speed is " + this.speed + "Km / h.";
        } else {
            this.speed = maxSpeed;
            return "The car has speed up and its current speed is " + this.speed + "Km / h.";
        }
    }
}
