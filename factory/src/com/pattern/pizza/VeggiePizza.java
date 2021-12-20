package com.pattern.pizza;

import com.pattern.abstractfactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {

    }
}
