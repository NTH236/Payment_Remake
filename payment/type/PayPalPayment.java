package payment.type;

import payment.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toán bằng PayPal: " + amount);
    }
}