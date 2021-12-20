package com.pattern.factory;

import com.pattern.pizza.Pizza;

public abstract class PizzaStore {

    public static final String CHEESE = "cheese";
    public static final String VEGGIE = "veggie";
    public static final String CLAM = "clam";
    public static final String PEPPERONI = "pepperoni";

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
