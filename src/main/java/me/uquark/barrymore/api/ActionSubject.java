package me.uquark.barrymore.api;

import java.io.Serializable;

public class ActionSubject implements Serializable {
    public final String klass;
    public final String address;

    public ActionSubject(String klass, String address) {
        this.klass = klass;
        this.address = address;
    }
}
