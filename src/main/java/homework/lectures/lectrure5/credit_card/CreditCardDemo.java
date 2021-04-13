package homework.lectures.lectrure5.credit_card;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class CreditCardDemo {
    private static final Logger logger = Logger.getLogger(CreditCardDemo.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();

        CreditCard creditCard1 = new CreditCard(4916989640548383L, 1111);
        CreditCard creditCard2 = new CreditCard(1111111111111111L, 2222);
        creditCard1.setCreditLimit(3000L);
        creditCard1.withdraw(1111,500L);
        logger.info(creditCard1);
        creditCard1.deposit(1111,1000L);
        logger.info(creditCard1);
        creditCard2.deposit(2558,300L);
        logger.info(creditCard2);
        creditCard1.deposit(1111,1000L);
        logger.info(creditCard1);

    }
}
