package com.usermanager.database;

public class ManagerDatabase {
    private String email;
    private String password;

    public ManagerDatabase(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void saveToDatabase() {
        System.out.println("Saving user to the database...");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}
