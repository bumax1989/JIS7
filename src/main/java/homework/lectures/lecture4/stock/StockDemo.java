package homework.lectures.lecture4.stock;

public class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        google.printInformation();
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        Stock maz = new Stock("MAZ", 1);
        maz.printInformation();
        maz.updatePrice(3);
        maz.updatePrice(4);
        maz.updatePrice(2);
    }
}
