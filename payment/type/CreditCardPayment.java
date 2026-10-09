package payment.type;

import payment.PaymentStrategy;


public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        // Có thể bổ sung logic mã hóa thẻ tại đây mà không ảnh hưởng hệ thống ngoài
        System.out.println("Thanh toán bằng thẻ tín dụng: " + amount);
    }
}