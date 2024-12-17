package com.creditcardpaiment;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment paypalPayment = new PayPalPayment();
        Payment cryptoPayment = new CryptoPayment();

        PaymentProcessor creditCardPaymentProcessor = new PaymentProcessor(creditCardPayment);
        PaymentProcessor paypalPaymentProcessor = new PaymentProcessor(paypalPayment);
        PaymentProcessor cryptoPaymentProcessor = new PaymentProcessor(cryptoPayment);

        creditCardPaymentProcessor.makePayment(100.0);
        paypalPaymentProcessor.makePayment(200.0);
        cryptoPaymentProcessor.makePayment(300.0);
    }
}
