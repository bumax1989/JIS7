package homework.lectures.lecture6.math_operations;

public class MathOperationsDemo {
    public static void main(String[] args) {

        OperationExecutor executor = new OperationExecutor();

        MathOperation[] ops = {
                new AdditionOperation(),
                new SubtractionOperation(),
                new MultiplicationOperation(),
                new DivisionOperation()
        };
        executor.execute(ops, 5, 3);
    }
}
