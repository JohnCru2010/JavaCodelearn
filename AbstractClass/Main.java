package AbstractClass;

public class Main {
    public static void main (String[] args) {
        Triangle t = new Triangle(6, 3);
        Rectangle r = new Rectangle (6, 4);
        Circle c = new Circle (1, 1);

        System.out.println("The perimeter of a triangle of base " + t.width + " and height "+ t.height + " is " + t.calculatePerimeter());
        System.out.println("The area of a triangle of base " + t.width + " and height "+ t.height + " is " + t.calculateArea());

        System.out.println("The perimeter of a rectangle of base " + r.width + " and height "+ r.height + " is " + r.calculatePerimeter());
        System.out.println("The area of a rectangle of base " + r.width + " and height "+ r.height + " is " + r.calculateArea());

        System.out.println("The perimeter of a circle of radius " + c.height + " is " + c.calculatePerimeter());
        System.out.println("The area of a circle of radius " + c.height + " is " + c.calculateArea());
    }
}
