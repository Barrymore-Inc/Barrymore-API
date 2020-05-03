package me.uquark.barrymore.api;

import java.io.Serializable;

public class Subject implements Serializable {
    public final String klass;
    public final String address;

    public Subject(String klass, String address) {
        this.klass = klass;
        this.address = address;
    }
}
