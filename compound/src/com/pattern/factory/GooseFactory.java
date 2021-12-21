package com.pattern.factory;

import com.pattern.AbstractGooseFactory;
import com.pattern.Quackable;
import com.pattern.goose.Goose;
import com.pattern.goose.GooseAdapter;

public class GooseFactory implements AbstractGooseFactory {
    @Override
    public Quackable createGooseDuck() {
        return new GooseAdapter(new Goose());
    }
}
