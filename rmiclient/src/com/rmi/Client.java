package com.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args){
        try {
            Registry registry = LocateRegistry.getRegistry(8080);
            MyService service = (MyService) registry.lookup("RemoteHello");
            String str = service.sayHello();
            System.out.println(str);
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }

    }
}
