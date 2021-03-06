package com.pattern.hook;

public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }


    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring info cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }
}
