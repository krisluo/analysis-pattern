package com.pattern.abstractfactory;

import com.pattern.intgredient.cheese.Cheese;
import com.pattern.intgredient.clam.Clams;
import com.pattern.intgredient.dough.Dough;
import com.pattern.intgredient.pepperoni.Pepperoni;
import com.pattern.intgredient.sauce.Sauce;
import com.pattern.intgredient.veggie.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
