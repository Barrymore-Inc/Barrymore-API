package me.uquark.barrymore.api;

import java.io.Serializable;

public class Coords implements Serializable {
    public float x;
    public float y;
    public float z;

    public Coords(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
