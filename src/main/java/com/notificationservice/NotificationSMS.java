package com.notificationservice;

public class NotificationSMS implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);   
    }
}
