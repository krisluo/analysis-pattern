package com.pattern;

/**
 * todo 有什么问题？非线程安全的
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return uniqueInstance;
    }
}
