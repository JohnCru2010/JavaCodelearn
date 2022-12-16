package StackClass;

public class Main {
    public static void main (String[] args) {
        Stack s = new Stack(5);
        s.add(1);
        s.add(10);
        s.add(100);
        s.add(1000);
        System.out.println(s.toString(""));
        System.out.println("The first element of the stack is " + s.first());
        s.extract();
        s.extract();
        System.out.println("The first element of the stack is " + s.first());
        System.out.println(s.toString(""));
    }
}
