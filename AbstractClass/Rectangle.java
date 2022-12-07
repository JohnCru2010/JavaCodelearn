package AbstractClass;

public class Rectangle extends Figure{
    public Rectangle (double height, double width) {
        super(height, width);
    }
    public double calculatePerimeter() {
        return (height + width) * 2;
    }
    public double calculateArea() {
        return height * width;
    }
}
