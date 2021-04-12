package homework.lectures.lectrure5.counter;

import org.apache.log4j.Logger;

public class Counter {
    private static final Logger logger = Logger.getLogger(Counter.class);

    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }

    public void increment() {
        //TODO
        if (value + step > 100) {
            logger.info("The result of increment operation more than 100. It will be aborted.");
        } else
            logger.info("The counter is equal to: " + (value += step));
    }

    public void decrement() {
        //TODO
        if (value - step < 0) {
            logger.info("The result of decrement operation less than zero. It will be aborted.");
        } else
            logger.info("The counter is equal to: " + (value -= step));
    }

    public void clear() {
        //TODO
        value = 0;
        step = 1;
    }

    public void setValue(int value) {
        //TODO
        if (value < 0 || value > 100) {
            logger.info("The value must be in the range between 0 and 100");
        } else
            this.value = value;
    }

    public int getValue() {
        //TODO
        return value;
    }

    public void setStep(int step) {
        //TODO
        if (step < 1 || step > 10) {
            logger.info("The step must be in the range between 1 and 10");
        } else
            this.step = step;
    }

    public int getStep() {
        //TODO
        return step;
    }
}