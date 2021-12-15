package com.pattern.ceo.monitor;

import com.pattern.GumballMachineRemote;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMonitorTestDrive {

    public static void main(String[] args){
        String[] locations = {"santafe","boulder","seattle"};
        GumballMonitor[] monitors = new GumballMonitor[locations.length];

        try {
            Registry registry = LocateRegistry.getRegistry(8080);
            for (int i=0;i<locations.length;i++){
                GumballMachineRemote machine = (GumballMachineRemote) registry.lookup(locations[i]);
                monitors[i] = new GumballMonitor(machine);
                System.out.println(monitors[i]);

            }
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }

        for (int i=0;i<monitors.length;i++){
            monitors[i].report();
        }

    }
}
