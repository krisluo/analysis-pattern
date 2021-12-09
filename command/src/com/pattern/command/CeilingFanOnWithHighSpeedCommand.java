package com.pattern.command;

import com.pattern.Command;
import com.pattern.example.CeilingFan;

public class CeilingFanOnWithHighSpeedCommand implements Command {
    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOnWithHighSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        } else {
            ceilingFan.off();
        }
    }
}
