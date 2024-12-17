package com.usermanager;

import com.usermanager.database.*;
import com.usermanager.helpers.*;

public class UserManager {
    private String email;
    private String password;
    ManagerDatabase managerDatabase;
    Notification notification;
    Validators validators;
    
    public UserManager(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public void addUser() {
        managerDatabase = new ManagerDatabase(email, password);
        notification = new Notification(email);
        validators = new Validators(email, password);

        if (validators.isValidEmail() && validators.isValidPassword()) {
            managerDatabase.saveToDatabase();
            notification.sendWelcomeEmail();
        } else {
            System.out.println("Invalid email or password. User not added.");
        }
    }
}
