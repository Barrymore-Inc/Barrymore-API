package me.uquark.barrymore.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BarrymoreBrain extends Remote {
    void registerBinding(BarrymoreBinding binding) throws RemoteException;
    void unregisterBinding(BarrymoreBinding binding) throws RemoteException;
    void processUserMessage(String message) throws RemoteException;
}
