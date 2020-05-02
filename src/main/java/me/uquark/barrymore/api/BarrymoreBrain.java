package me.uquark.barrymore.api;

import java.rmi.Remote;

public interface BarrymoreBrain extends Remote {
    void registerBinding(BarrymoreBinding binding);
    void unregisterBinding(BarrymoreBinding binding);
    void processUserMessage(String message);
}
