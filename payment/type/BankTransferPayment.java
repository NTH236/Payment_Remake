package payment.type;

import payment.PaymentStrategy;

public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toán bằng chuyển khoản: " + amount);
    }
}