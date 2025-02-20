package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> orderList = new ArrayList<>();
    public void takeOrder(Order order){
        orderList.add(order);
    }
    public void executeOrder(){
        for(Order order:orderList){
            order.execute();
        }
    }
}
