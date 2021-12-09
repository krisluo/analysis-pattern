package com.pattern.command;

import com.pattern.Command;
import com.pattern.example.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }


    @Override
    public void undo() {
        light.off();
    }
}
