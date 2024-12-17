package com.notificationservice;

public class NotificationEmail implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);   
    }
}
