package com.pattern.command;

import com.pattern.Command;
import com.pattern.example.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;


    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
