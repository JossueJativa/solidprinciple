package com.usermanager.helpers;

import java.util.regex.Pattern;

public class Validators {
    private String email;
    private String password;

    public Validators(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public boolean isValidEmail() {
        System.out.println("Validating email: " + email);
        return email != null && Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }

    public boolean isValidPassword() {
        System.out.println("Validating password: " + password);
        return password != null && password.length() >= 8;
    }
}
