package me.uquark.barrymore.api;

import java.io.Serializable;

public class Order implements Serializable {
    public Action action;
    public Subject[] subjects;
    public String[] parameters;
    public String response;

    public Order(Action action, Subject[] subjects, String[] parameters, String response) {
        this.action = action;
        this.subjects = subjects;
        this.parameters = parameters;
        this.response = response;
    }

    public Order() {

    }
}
