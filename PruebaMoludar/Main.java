package PruebaMoludar;

import PruebaMoludar.app.test.ClassTest;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ClassTest coche = new ClassTest();
        coche.acelerar();
        coche.acelerar();
        coche.acelerar();

        System.out.println(coche.velocidad);
    }
}
