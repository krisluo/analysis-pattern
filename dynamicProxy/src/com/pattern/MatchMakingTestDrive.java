package com.pattern;

import com.pattern.service.PersonBean;
import com.pattern.service.PersonBeanImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MatchMakingTestDrive {
    Map<String,PersonBean> database = new HashMap<>();
    
    public static void main(String[] args){
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    private void drive() {
        PersonBean joe = getPersonFromDatabase("Joe Javabean");
        PersonBean ownerProxy = getProxy(new OwnerInvocationHandler(joe), joe);
        System.out.println("Name is " + ownerProxy.getName());

        ownerProxy.setInterests("bowling, Go");
        System.out.println("interests set from owner proxy");
        try{
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e){
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getProxy(new NonOwnerInvocationHandler(joe),joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try{
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e){
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

        System.out.println(Proxy.isProxyClass(nonOwnerProxy.getClass()));
        System.out.println(Proxy.isProxyClass(joe.getClass()));
    }

    private PersonBean getPersonFromDatabase(String id) {
        return database.get(id);
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    private void initializeDatabase() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("Joe");
        joe.setGender("man");
        joe.setHotOrNotRating(7);
        database.put("Joe Javabean",joe);
    }

    PersonBean getOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

    PersonBean getProxy(InvocationHandler handler, PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                handler);
    }
}
