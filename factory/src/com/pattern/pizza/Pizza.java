package com.pattern.pizza;

import com.pattern.intgredient.cheese.Cheese;
import com.pattern.intgredient.clam.Clams;
import com.pattern.intgredient.dough.Dough;
import com.pattern.intgredient.pepperoni.Pepperoni;
import com.pattern.intgredient.sauce.Sauce;
import com.pattern.intgredient.veggie.Veggies;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;


    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public Pizza setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
}
