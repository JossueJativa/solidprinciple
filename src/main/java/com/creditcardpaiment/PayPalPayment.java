package com.creditcardpaiment;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment of $" + amount);
    }
}