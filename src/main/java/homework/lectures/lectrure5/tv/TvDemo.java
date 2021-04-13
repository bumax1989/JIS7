package homework.lectures.lectrure5.tv;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class TvDemo {
    private static final Logger logger = Logger.getLogger(TvDemo.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Tv tv1 = new Tv(1, 10, "SONY", true);
        Tv tv2 = new Tv(5, 10, "Samsung", false);

        tv1.switchChanelUp();
        tv1.switchChanelUp();

        tv1.switchVolumeDown();
        tv1.switchVolumeDown();
        tv1.turnOffTV();
        tv1.switchVolumeDown();

        logger.info(tv1);
        logger.info(tv2);
    }
}
