package com.pattern.duck;

import com.pattern.Quackable;
import com.pattern.observer.Observable;
import com.pattern.observer.QuackObservable;
import com.pattern.observer.QuackObserver;

public class RedheadDuck implements Quackable {
    QuackObservable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Redhead Duck";
    }

}
