package AbstractClass;

public class Circle extends Figure{
    public Circle (double height, double width) {
        super(height, width);
    }
    public double calculatePerimeter() {
        if (height != width) {
            return 0.0;
        } else {
            return 3.1415 * height * 2;
        }   
    }
    public double calculateArea() {
        if (height != width) {
            return 0.0;
        } else {
            return 3.1415 * height * height;
        }   
    }
}
