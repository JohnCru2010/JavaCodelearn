package Prueba1;

public class Coche {
    private int speed;
    Coche(){
        this.speed = 0;
    }
    public int acelerar (int n) {
        return speed += n;
    }
}
