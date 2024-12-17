package com.example;

public class InvoicePrinter {
    Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        double tax = this.invoice.calculateTax();
        System.out.println("Printing Invoice...");
        System.out.println("Amount: " + this.invoice.getAmount());
        System.out.println("Tax: " + tax);
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice(200);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.print();
    }
}
