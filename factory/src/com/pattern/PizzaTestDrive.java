package com.pattern;

import com.pattern.factory.ChicagoPizzaStore;
import com.pattern.factory.NYPizzaStore;
import com.pattern.factory.PizzaStore;
import com.pattern.pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaStore.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

//        pizza = chicagoStore.orderPizza(PizzaStore.CHEESE);
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }

}
