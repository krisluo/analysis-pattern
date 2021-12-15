package com.pattern;

import com.pattern.service.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try{
            if (method.getName().startsWith("get") || "setHotOrNotRating".equals(method.getName())){
                return method.invoke(person, args);
            } else if (method.getName().startsWith("set")){
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }
}
