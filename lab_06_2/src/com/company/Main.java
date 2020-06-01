package com.company;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(5);

        int id = 0;

        while (server.getCurrentCountVehicle() != server.getLimitVehicle()) {
            switch (((int) (Math.random() * (5 - 1))) + 1) {
                case 1:
                    TractorCrawler tractorCrawler = new TractorCrawler("TC " + id, 2000, 100);
                    server.addTransport(id, tractorCrawler);
                    id++;
                    break;
                case 2:
                    Bus bus = new Bus("Bus " + id, 2000, 100, 30);
                    server.addTransport(id, bus);
                    id++;
                    break;
                case 3:
                    TractorWheeled tractorWheeled = new TractorWheeled("TW " + id, 2000, 100);
                    server.addTransport(id, tractorWheeled);
                    id++;
                    break;
                default:
                    break;
            }

        }

        System.out.println("Limit: " + server.getLimitVehicle());
        System.out.println("Count: " + server.getCurrentCountVehicle());
    }
}
