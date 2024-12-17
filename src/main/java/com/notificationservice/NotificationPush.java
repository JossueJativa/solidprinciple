package com.notificationservice;

public class NotificationPush implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification: " + message);   
    }
}
