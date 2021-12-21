package com.pattern.composite;

import com.pattern.Quackable;
import com.pattern.observer.QuackObserver;

import java.util.ArrayList;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();

    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        for (Quackable quacker : quackers){
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Quackable quacker : quackers){
            quacker.notifyObservers();
        }
    }
}
