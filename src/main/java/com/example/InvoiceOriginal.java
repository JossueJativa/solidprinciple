package com.example;

class InvoiceOriginal {
    private double amount;

    public InvoiceOriginal(double amount) {
        this.amount = amount;
    }

    public void calculateTax() {
        System.out.println("Calculating tax for the invoice: " + (amount * 0.1));
    }

    public void printInvoice() {
        System.out.println("Printing Invoice...");
        System.out.println("Amount: " + amount);
        System.out.println("Tax: " + (amount * 0.1));
    }

    // main
    public static void main(String[] args) {
        InvoiceOriginal invoice = new InvoiceOriginal(100);
        invoice.calculateTax();
        invoice.printInvoice();
    }
}