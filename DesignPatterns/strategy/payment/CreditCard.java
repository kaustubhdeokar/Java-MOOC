package strategy.payment;

public class CreditCard implements IPaymentStrategy {
    @Override
    public void pay() {
        System.out.println("paying through credit card");
    }
}
