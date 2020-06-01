package com.company;

abstract class Machine implements Run {
    public String name;
    public float weight;
    public float speed;
    public int passengersCount;

    public Machine(String name, float weight, float speed, int passengersCount) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.passengersCount = passengersCount;
    }

    public float getMaxSpeed() {
        return this.speed;
    }

    public float getWeight() {
        return this.weight;
    }

    public void printName() {
        System.out.println(this.name);
    }

    public void move() {
        System.out.println("Move " + this.name);
    }
}
