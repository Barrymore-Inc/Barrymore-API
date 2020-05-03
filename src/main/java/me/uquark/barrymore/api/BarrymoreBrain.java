package me.uquark.barrymore.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BarrymoreBrain extends Remote {
    void processUserMessage(BarrymoreBinding caller, int userHashCode, String message) throws RemoteException;
}
