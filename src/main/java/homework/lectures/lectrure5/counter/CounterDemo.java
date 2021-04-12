package homework.lectures.lectrure5.counter;

import org.apache.log4j.BasicConfigurator;

public class CounterDemo {
    public static void main(String[] args) {
        BasicConfigurator.configure();

        Counter counter = new Counter();

        counter.getValue();
        counter.getStep();
        counter.increment();
        counter.getValue();
        counter.setStep(5);
        counter.clear();
        counter.increment();
        counter.setStep(2);
        counter.decrement();
    }
}
