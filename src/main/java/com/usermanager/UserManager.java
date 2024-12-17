package com.usermanager;

import com.usermanager.database.*;
import com.usermanager.helpers.*;

public class UserManager {
    private String email;
    private String password;
    
    ManagerDatabase managerDatabase = new ManagerDatabase(this.email, this.password);
    Notification notification = new Notification(this.email);
    Validators validators = new Validators(this.email, this.password);

    public UserManager(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void addUser() {
        if (validators.isValidEmail() && validators.isValidPassword()) {
            managerDatabase.saveToDatabase();
            notification.sendWelcomeEmail();
        } else {
            System.out.println("Invalid email or password. User not added.");
        }
    }
}
