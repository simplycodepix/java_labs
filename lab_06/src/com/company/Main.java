package com.company;

public class Main {
    public static void main(String[] args) {
	    Server server = new Server(5);

	    int id = 0;

	    while (server.getCurrentCountVehicle() != server.getLimitVehicle()) {
            switch (((int)(Math.random() * (5 - 1))) + 1) {
                case 1:
                    Bicycle bicycle = new Bicycle();
                    server.addTransport(id, bicycle);
                    break;
                case 2:
                    Car car = new Car();
                    server.addTransport(id, car);
                    break;
                case 3:
                    Jumpers jumpers = new Jumpers();
                    server.addTransport(id, jumpers);
                    break;
                case 4:
                    RollerSkates rollerSkates = new RollerSkates();
                    server.addTransport(id, rollerSkates);
                    break;
                default:
                    break;
            }
            id++;
        }

	    System.out.println("Limit: " + server.getLimitVehicle() );
	    System.out.println("Count: " + server.getCurrentCountVehicle() );
    }
}
