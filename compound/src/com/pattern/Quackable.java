package com.pattern;

import com.pattern.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
