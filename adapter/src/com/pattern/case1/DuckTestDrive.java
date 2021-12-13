package com.pattern.case1;

import com.pattern.case1.adapter.TurkeyAdapter;
import com.pattern.case1.example.Duck;
import com.pattern.case1.example.MallardDuck;
import com.pattern.case1.example.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThr Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
