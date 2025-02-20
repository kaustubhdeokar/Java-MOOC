package strategy.payment;

public class Checkout {

    public IPaymentStrategy payment;

    public Checkout(IPaymentStrategy payment) {
        this.payment = payment;
    }

    public void pay(){
        payment.pay();
    }
}
