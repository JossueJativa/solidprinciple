package com.usermanager.helpers;

public class Notification {
    private String email;

    public Notification(String email) {
        this.email = email;
    }

    public void sendWelcomeEmail() {
        System.out.println("Sending welcome email to " + this.email);
    }
}
