package homework.lectures.lecture6.math_operations;

public class MultiplicationOperation implements MathOperation<Double> {
    @Override
    public Double compute(Double a, Double b) {
        return a * b;
    }
}
