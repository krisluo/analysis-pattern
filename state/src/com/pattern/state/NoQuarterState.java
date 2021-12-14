package com.pattern.state;

import com.pattern.GumballMachine;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 到HasQuarterState
     */
    @Override
    public void insertQuarter() {
        System.out.println("You insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    /**
     * 告诉顾客“你还没有投入25分钱”
     */
    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    /**
     * You turned but there's no quarter
     */
    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    /**
     * You need to pay first
     */
    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
