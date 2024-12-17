package com.devices;

public class Main {
    public static void main(String[] args) {
        Device phone = new Phone();
        Device camera = new DisposableCamera();

        phone.turnOn();
        ((Phone) phone).charge();

        camera.turnOn();
    }
}
