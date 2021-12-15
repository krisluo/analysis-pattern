package com.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args){
        try{
            MyService service = new MyServiceImpl();
            Registry registry = LocateRegistry.createRegistry(8080);
            registry.rebind("RemoteHello", service);
            System.out.println("remote hello service start......");
        } catch (Exception e){
            //

            e.printStackTrace();
        }
    }
}
