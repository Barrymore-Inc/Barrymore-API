package me.uquark.barrymore.api;

import java.io.Serializable;

public class ActionObject implements Serializable {
    public final String name;

    public ActionObject(String name) {
        this.name = name;
    }
}
