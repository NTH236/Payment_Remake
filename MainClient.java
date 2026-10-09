import payment.PaymentStrategy;
import payment.service.PaymentService;
import payment.type.BankTransferPayment;
import payment.type.CreditCardPayment;
import payment.type.PayPalPayment;

public class MainClient {
    public static void main(String[] args) {
        double amountToPay = 5000.0;

        // 1. Lắp ráp module Thẻ tín dụng và thực thi
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentService service = new PaymentService(creditCard);
        service.pay(amountToPay);

        // 2. Chuyển đổi chiến thuật sang PayPal ngay lập tức mà không cần tạo mới service
        PaymentStrategy paypal = new PayPalPayment();
        service.setPaymentStrategy(paypal);
        service.pay(amountToPay);

        // 3. Sử dụng Chuyển khoản ngân hàng
        service.setPaymentStrategy(new BankTransferPayment());
        service.pay(amountToPay);
    }
}