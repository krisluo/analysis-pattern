package com.pattern.observer;


public interface QuackObservable {
    void registerObserver(QuackObserver observer);
    void notifyObservers();
}
