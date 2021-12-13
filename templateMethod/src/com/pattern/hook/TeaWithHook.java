package com.pattern.hook;

import com.pattern.hook.CaffeineBeverageWithHook;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew(){
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments(){
        System.out.println("Adding Lemon");
    }
}
