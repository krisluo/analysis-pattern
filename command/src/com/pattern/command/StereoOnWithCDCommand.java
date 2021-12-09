package com.pattern.command;

import com.pattern.Command;
import com.pattern.example.Stereo;

public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.setVolume(0);
        stereo.takeOutCd();
        stereo.off();

    }
}
