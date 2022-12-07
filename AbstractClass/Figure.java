package AbstractClass;

public abstract class Figure {
    protected double height;
    protected double width;
    
    public Figure (double height, double width){
        this.height = height;
        this.width = width;
    }
    
    public double getHeight() {
        return height;
    }    
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public abstract double calculatePerimeter();
    public abstract double calculateArea();
}
