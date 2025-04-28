package strategy.ex1;

// Usage
public class DemoExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        // Switch to PayPal
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(300);
    }
}