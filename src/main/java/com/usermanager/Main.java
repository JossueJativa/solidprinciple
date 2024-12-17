package com.usermanager;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager("example@domain.com", "password123");
        userManager.addUser();

        UserManager userManager2 = new UserManager("invalid-email", "1234");
        userManager2.addUser();
    }
}
