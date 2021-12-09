package com.pattern.example;

public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " Light on!");
    }

    public void off(){
        System.out.println(location + " Light off!");
    }
}
