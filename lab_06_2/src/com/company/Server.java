package com.company;

public class Server {
    private int[] countVehicles;
    private int commonCountVehicles = 0;
    private int limitVehicle;
    private Machine[] vehicles;

    public Server(int size) {
        countVehicles = new int[size];
        this.limitVehicle = size;
         vehicles = new Machine[size];
    }

    public int getLimitVehicle() {
        return limitVehicle;
    }

    public int getCurrentCountVehicle() {
        return commonCountVehicles;
    }

    public void addTransport(int numberVehicles, Machine vehicle) {
        countVehicles[numberVehicles]++;
        vehicles[this.commonCountVehicles] = vehicle;
        vehicles[numberVehicles].move();
        this.commonCountVehicles++;
    }
}