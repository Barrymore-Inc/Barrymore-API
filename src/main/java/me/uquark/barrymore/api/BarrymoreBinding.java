package me.uquark.barrymore.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BarrymoreBinding extends Remote {
    void processOrder(Order order) throws RemoteException;
    String getName() throws RemoteException;
}
