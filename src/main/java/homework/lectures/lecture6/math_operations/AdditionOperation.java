package homework.lectures.lecture6.math_operations;

public class AdditionOperation implements MathOperation<Double> {
    @Override
    public Double compute(Double a, Double b) {
        return a + b;
    }
}
