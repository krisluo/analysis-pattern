package com.pattern.factory;

import com.pattern.AbstractDuckFactory;
import com.pattern.Quackable;
import com.pattern.decorator.QuackCount;
import com.pattern.duck.DuckCall;
import com.pattern.duck.MallarDuck;
import com.pattern.duck.RedheadDuck;
import com.pattern.duck.RubberDuck;

public class CountingDuckFactory implements AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCount(new MallarDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCount(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCount(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCount(new RubberDuck());
    }
}
