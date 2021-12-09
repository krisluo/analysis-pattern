package com.pattern.example;

public class Stereo {

    private int volume;

    public void on(){
        System.out.println("Stereo on!");
    }

    public void off(){
        System.out.println("Stereo off!");
    }

    public void setCd(){
        System.out.println("Stereo set CD!");
    }
    public void takeOutCd(){
        System.out.println("Stereo take out CD!");
    }

    public void setDvd(){
        System.out.println("Stereo set DVD!");
    }

    public void setRadio(){
        System.out.println("Stereo set radio!");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
