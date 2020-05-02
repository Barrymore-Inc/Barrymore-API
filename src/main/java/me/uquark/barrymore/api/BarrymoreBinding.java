package me.uquark.barrymore.api;

import java.rmi.Remote;

public interface BarrymoreBinding extends Remote {
    void processAction(ActionObject action, ActionSubject[] subjects, String[] parameters);
}
