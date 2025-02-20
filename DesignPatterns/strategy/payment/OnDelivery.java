package strategy.payment;

public class OnDelivery implements IPaymentStrategy {
    @Override
    public void pay() {
        System.out.println("on delivery, proceed to checkout");
    }
}
