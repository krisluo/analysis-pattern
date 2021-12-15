package com.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyServiceImpl extends UnicastRemoteObject implements MyService{
    protected MyServiceImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        System.out.println("invoke say hello");
        return "Server says, 'Hey'";
    }
}
