package com.pattern;

import com.pattern.composite.Flock;
import com.pattern.decorator.QuackCount;
import com.pattern.factory.CountingDuckFactory;
import com.pattern.factory.GooseFactory;
import com.pattern.observer.Quackologist;

public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractGooseFactory gooseFactory = new GooseFactory();
        simulator.simulate(duckFactory,gooseFactory);
    }

    void simulate(AbstractDuckFactory duckFactory,AbstractGooseFactory gooseFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = gooseFactory.createGooseDuck();

        //System.out.println("\nDuck Simulator: with Composite - Flocks");
        Flock flockDucks = new Flock();
        flockDucks.add(redheadDuck);
        flockDucks.add(duckCall);
        flockDucks.add(rubberDuck);
        flockDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        flockDucks.registerObserver(quackologist);

        simulate(flockDucks);
        /*System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);*/

        System.out.println("The ducks quacked " + QuackCount.getNumberOfQuacks() + " times");

    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
