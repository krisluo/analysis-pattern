package com.pattern;

import com.pattern.command.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("----------Remote Control----------\n");
        for (int i = 0; i < onCommands.length; i++) {
            out.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append("\t")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        out.append("undo command ").append(undoCommand.getClass().getName());
        return out.toString();
    }
}
