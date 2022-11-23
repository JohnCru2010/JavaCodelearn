package PruebaMoludar;

import PruebaMoludar.app.test.ClassTest;

public class Main {
    private static void main(String[] args) {
        ClassTest coche = new ClassTest();
        coche.acelerar();
        coche.acelerar();
        coche.acelerar();

        System.out.println(coche.velocidad);
    }
}
