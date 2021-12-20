package com.pattern.abstractfactory;

import com.pattern.intgredient.cheese.Cheese;
import com.pattern.intgredient.cheese.MozzarellaCheese;
import com.pattern.intgredient.clam.Clams;
import com.pattern.intgredient.clam.FrozenClams;
import com.pattern.intgredient.dough.Dough;
import com.pattern.intgredient.dough.ThickCrustDough;
import com.pattern.intgredient.pepperoni.Pepperoni;
import com.pattern.intgredient.pepperoni.SlicedPepperoni;
import com.pattern.intgredient.sauce.PlumTomatoSauce;
import com.pattern.intgredient.sauce.Sauce;
import com.pattern.intgredient.veggie.BlackOlives;
import com.pattern.intgredient.veggie.EggPlant;
import com.pattern.intgredient.veggie.Spinach;
import com.pattern.intgredient.veggie.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(),new Spinach(),new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
