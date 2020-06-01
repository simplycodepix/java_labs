package com.company;

public class Tractor extends Machine {
    String type;

    public Tractor(String name, float speed, float weight, String type) {
        super(name, speed, weight, 1);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
