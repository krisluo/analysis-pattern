package com.pattern.state;

import java.io.Serializable;

public interface State extends Serializable {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    default  void refill(int count){
        System.out.println("Gumball not sold out");
    }
}
