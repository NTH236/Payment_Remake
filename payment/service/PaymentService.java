package payment.service;

import payment.PaymentStrategy;

public class PaymentService {
    private PaymentStrategy strategy;

    // Không tự tạo vũ khí, nhận nó từ hậu phương
    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Cho phép tráo đổi vũ khí ngay giữa trận đánh (Runtime)
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Hệ thống chưa được trang bị mô-đun thanh toán.");
        }
        strategy.processPayment(amount);
    }
}