package com.usermanager.database;

import java.util.regex.Pattern;

public class ManagerDatabase {
    private String email;
    private String password;

    public ManagerDatabase(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void saveToDatabase() {
        System.out.println("Saving user to the database...");
        System.out.println("Email: " + this.email);
        System.out.println("Password: " + this.password);
    }
}
