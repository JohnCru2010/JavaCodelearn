package AbstractClass;

public class Triangle extends Figure{
    public Triangle (double height, double width) {
        super(height, width);
    }
    public double calculatePerimeter() {
        return width*3;
    }
    public double calculateArea() {
        return (height * width) / 2;
    }
}
