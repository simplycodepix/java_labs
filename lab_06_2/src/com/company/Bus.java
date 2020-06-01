package com.company;

class Bus extends Machine {
    public int passengersCount;

    public Bus(String name, float weight, float speed, int passengersCount) {
        super(name, weight, speed, passengersCount);
    }

    public int getPassengersCount() {
        return passengersCount;
    }
}
