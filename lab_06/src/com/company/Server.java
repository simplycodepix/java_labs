package com.company;

public class Server {
    private int[] countVehicles;
    private int commonCountVehicles = 0;
    private int limitVehicle;
    private Vehicle[] vehicles;

    public Server(int size) {
        countVehicles = new int[size];
        this.limitVehicle = size;
         vehicles = new Vehicle[size];
    }

    public int getLimitVehicle() {
        return limitVehicle;
    }

    public int getCurrentCountVehicle() {
        return commonCountVehicles;
    }

    public void addTransport(int numberVehicles, Vehicle vehicle) {
        countVehicles[numberVehicles]++;
        vehicles[this.commonCountVehicles] = vehicle;
        vehicles[numberVehicles].move(numberVehicles + 1);
        this.commonCountVehicles++;
    }
}