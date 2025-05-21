package strategy.ex1;

// Usage
public class Demo {
    public static void main(String[] args) {
        PaymentService cart = new PaymentService();

        // Pay with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        // Switch to PayPal
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(300);
    }
}