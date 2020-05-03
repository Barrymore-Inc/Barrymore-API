package me.uquark.barrymore.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BarrymoreBinding extends Remote {
    void processAction(ActionObject action, ActionSubject[] subjects, String[] parameters) throws RemoteException;
}
