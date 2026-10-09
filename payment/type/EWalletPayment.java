package payment.type;

import payment.PaymentStrategy;

public class EWalletPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toán bằng ví điện tử: " + amount);
    }
}