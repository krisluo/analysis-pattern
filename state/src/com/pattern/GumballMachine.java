package com.pattern;

import com.pattern.state.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    int count = 0;
    String location;

    public GumballMachine(String location, int count) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.location = location;
        this.count = count;
        if (count > 0){
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public GumballMachine setState(State state) {
        this.state = state;
        return this;
    }

    public GumballMachine setCount(int count) {
        this.count = count;
        return this;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0){
            count -= 1;
        }
    }

    public void refill(int count){
        this.count = count;
        state = noQuarterState;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public State getState() {
        return state;
    }
}
