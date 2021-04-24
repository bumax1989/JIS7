package homework.lectures.lecture6.shape;

public class Triangle extends AbstractShape {
    private Double sideA;
    private Double sideB;
    private Double sideC;
    private Double halfPerimeter;

    public Triangle(String name, Double sideA, Double sideB, Double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        halfPerimeter = (sideA + sideB + sideC) / 2;

        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }
}
