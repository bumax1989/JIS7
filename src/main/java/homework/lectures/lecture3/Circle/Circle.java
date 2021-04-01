package homework.lectures.lecture3.Circle;

public class Circle {
    private final double PI = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double area = 2 * PI * radius;
        return area;
    }
}
