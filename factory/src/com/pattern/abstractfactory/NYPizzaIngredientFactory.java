package com.pattern.abstractfactory;

import com.pattern.intgredient.cheese.Cheese;
import com.pattern.intgredient.cheese.ReggianoCheese;
import com.pattern.intgredient.clam.Clams;
import com.pattern.intgredient.clam.FreshClams;
import com.pattern.intgredient.dough.Dough;
import com.pattern.intgredient.dough.ThinCrustDough;
import com.pattern.intgredient.pepperoni.Pepperoni;
import com.pattern.intgredient.pepperoni.SlicedPepperoni;
import com.pattern.intgredient.sauce.MarinaraSauce;
import com.pattern.intgredient.sauce.Sauce;
import com.pattern.intgredient.veggie.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(),new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
