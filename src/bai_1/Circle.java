package bai_1;
public class Circle extends Shape {

    public Circle(double radius) {
        super(radius, radius);
    }

    public double getArea() {
        return Math.PI * width * width;
    }

    public double getCircumference() {
        return 2 * Math.PI * width;
    }
}