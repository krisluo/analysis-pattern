package com.pattern;

import com.pattern.ceo.monitor.GumballMonitor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException {
        GumballMachineRemote gumballMachine = null;
        int count;
        if (args.length<2){
            System.out.println("GumballMachine <name><inventory>");
            System.exit(1);
        }
        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0],count);

            LocateRegistry.getRegistry(8080).bind(args[0],gumballMachine);
            System.out.println("gumball machine is serving, location is " + args[0]);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
