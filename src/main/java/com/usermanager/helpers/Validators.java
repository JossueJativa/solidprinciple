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
        return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", this.email);
    }

    public boolean isValidPassword() {
        return this.password.length() >= 8;
    }
}
