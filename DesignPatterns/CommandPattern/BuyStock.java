package CommandPattern;

import CommandPattern.Order;
import CommandPattern.Stock;

public class BuyStock implements Order {
    Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
