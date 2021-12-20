package com.pattern.factory;

import com.pattern.abstractfactory.NYPizzaIngredientFactory;
import com.pattern.abstractfactory.PizzaIngredientFactory;
import com.pattern.pizza.*;

public class NYPizzaStore extends PizzaStore{

    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        if (CHEESE.equals(type)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (VEGGIE.equals(type)){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (CLAM.equals(type)){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (PEPPERONI.equals(type)){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
