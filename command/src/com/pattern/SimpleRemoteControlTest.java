package com.pattern;

import com.pattern.command.GarageDoorOpenCommand;
import com.pattern.command.LightOnCommand;
import com.pattern.example.GarageDoor;
import com.pattern.example.Light;

public class SimpleRemoteControlTest {

    public static void main(String[] args){
        SimpleRemoteControl control = new SimpleRemoteControl();

        Light light = new Light("Living Room");
        control.setCommand(new LightOnCommand(light));
        control.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        control.setCommand(new GarageDoorOpenCommand(garageDoor));
        control.buttonWasPressed();
    }
}
