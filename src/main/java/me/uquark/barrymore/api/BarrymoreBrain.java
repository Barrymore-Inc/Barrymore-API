package me.uquark.barrymore.api;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BarrymoreBrain extends Remote {
    Order processUserMessage(Coords userCoords, String message) throws RemoteException;
    List<String> getPhrases() throws RemoteException;
}
