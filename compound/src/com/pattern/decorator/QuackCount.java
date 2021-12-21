package com.pattern.decorator;

import com.pattern.Quackable;
import com.pattern.observer.QuackObserver;

public class QuackCount implements Quackable {
    Quackable duck;
    static int numberOfQuacks;


    public QuackCount(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
