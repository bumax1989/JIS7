package homework.lectures.lectrure5.credit_card;

import org.apache.log4j.Logger;

public class CreditCard {
    private static final Logger logger = Logger.getLogger(CreditCard.class);

    private Long cardNumber;
    private Integer pinCode;
    private Long balance;
    private Long creditLimit;
    private Long creditIndebtedness;

    public CreditCard(Long cardNumber, Integer pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0L;
        this.creditIndebtedness = 0L;
        this.creditLimit = 0L;
    }

    public void withdraw(Integer pin, Long moneyAmount) {
        if (!pin.equals(pinCode)) {
            logger.info("PIN is incorrect");
        } else {
            balance -= moneyAmount;
            if (balance < 0) {
                creditIndebtedness -= balance;
                balance=0L;
                if (creditIndebtedness > creditLimit) {
                    logger.info("Credit limit reached");
                }
            }
        }
    }

    public void deposit(Integer pin, Long moneyAmount) {


        if (!pin.equals(pinCode)) {
            logger.info("PIN is incorrect");
        } else {
            if (creditIndebtedness > 0) {
                creditIndebtedness -= moneyAmount;
                if (creditIndebtedness < 0) {
                    balance -= creditIndebtedness;
                    creditIndebtedness=0L;
                }
            } else balance+=moneyAmount;
        }
    }

    public void setCreditLimit(Long creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", pinCode=" + pinCode +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", creditIndebtedness=" + creditIndebtedness +
                '}';
    }
}
