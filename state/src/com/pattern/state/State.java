package com.pattern.state;

public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    default  void refill(int count){
        System.out.println("Gumball not sold out");
    }
}
