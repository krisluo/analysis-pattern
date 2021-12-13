package com.pattern.case1.adapter;

import com.pattern.case1.example.Duck;
import com.pattern.case1.example.Turkey;

public class DuckAdapter implements Turkey {
    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        // TODO 鸭子飞得比较远，如何处理
        duck.fly();
    }
}
