package strategy.payment;

public class MainPayment {

    public static void main(String[] args) {

        IPaymentStrategy payment = new CreditCard();
        Checkout checkout = new Checkout(payment);
        checkout.pay();

        payment = new OnDelivery();
        checkout = new Checkout(payment);
        checkout.pay();

    }

}
