package bai_1;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("=== Rectangle ===");
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println();

        Circle circle = new Circle(7);
        System.out.println("=== Circle ===");
        System.out.println("Radius: " + circle.getWidth());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println();

        Shape shape = new Shape(3, 4);
        System.out.println("=== Shape (base) ===");
        System.out.println("Width: " + shape.getWidth());
        System.out.println("Height: " + shape.getHeight());
    }
}