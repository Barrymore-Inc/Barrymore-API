package me.uquark.barrymore.api;

import java.io.Serializable;

public class Order implements Serializable {
    public Action action;
    public Subject[] subjects;
    public String[] parameters;

    public Order(Action action, Subject[] subjects, String[] parameters) {
        this.action = action;
        this.subjects = subjects;
        this.parameters = parameters;
    }

    public Order() {

    }
}
