package me.uquark.barrymore.api;

import java.io.Serializable;

public class Action implements Serializable {
    public final String name;

    public Action(String name) {
        this.name = name;
    }
}
