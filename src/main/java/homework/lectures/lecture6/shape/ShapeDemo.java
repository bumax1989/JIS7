package homework.lectures.lecture6.shape;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ShapeDemo {
    private static final Logger logger = Logger.getLogger(ShapeDemo.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Shape[] shapes=new Shape[5];
        
        shapes[0] = new Circle("Circle1", 0);
        shapes[1] = new Square("Square1", 3.2);
        shapes[2] = new Circle("Circle3", 4.2);
        shapes[3] = new Triangle("Triangle", 5.0,8.0,11.0);
        shapes[4] = new Circle("Circle5", 6.2);

        for (Shape shape:shapes) {
            logger.info(shape.getName() + ": Area = " + shape.getArea()+";");
        }
        
    }
}
