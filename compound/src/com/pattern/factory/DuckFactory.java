package com.pattern.factory;

import com.pattern.AbstractDuckFactory;
import com.pattern.Quackable;
import com.pattern.duck.DuckCall;
import com.pattern.duck.MallarDuck;
import com.pattern.duck.RedheadDuck;
import com.pattern.duck.RubberDuck;

public class DuckFactory implements AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallarDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
