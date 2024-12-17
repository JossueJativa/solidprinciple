package com.creditcardpaiment;

public class PaymentProcessor {
    private Payment payment;

    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void makePayment(double amount) {
        payment.processPayment(amount);
    }
}
