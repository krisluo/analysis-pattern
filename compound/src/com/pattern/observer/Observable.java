package com.pattern.observer;

import java.util.ArrayList;

public class Observable implements QuackObservable{

    ArrayList<QuackObserver> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (QuackObserver observer : observers) {
            observer.update(duck);
        }
    }
}
