package homework.lectures.lecture6.shape;

public class Circle extends AbstractShape {

    private double radius;
    private final double PI = Math.PI;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
