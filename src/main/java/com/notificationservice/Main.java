package com.notificationservice;

public class Main {
    public static void main(String[] args) {
        NotificationService notification = new NotificationService();
        Notification email = new NotificationEmail();
        Notification sms = new NotificationSMS();
        Notification push = new NotificationPush();

        notification.sendNotification(email, "Hello via Email!");
        notification.sendNotification(sms, "Hello via SMS!");
        notification.sendNotification(push, "Hello via Push Notification!");

        Notification fax = new Notification() {
            @Override
            public void sendNotification(String message) {
                System.out.println("Sending Fax: " + message);
            }
        };

        notification.sendNotification(fax, "Hello via Fax!");
    }
}
