package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File fileManagers = new File("C:\\MainFiles\\projects\\university\\java_labs\\lab11\\InputManagers.txt");
        Scanner scannerManagers = new Scanner(fileManagers);

        Manager[] managers = new Manager[10];
        int managerCount = 0;

        while (scannerManagers.hasNextLine()) {
            String[] parts = scannerManagers.nextLine().split(" ");
            if (parts.length == 5) {
                managers[managerCount] = new Manager(Integer.parseInt(parts[0]), parts[1], parts[2], Double.parseDouble(parts[3]));
                managers[managerCount].setManager(managers[Integer.parseInt(parts[4])]);
            } else {
                managers[managerCount] = new Manager(Integer.parseInt(parts[0]), parts[1], parts[2], Double.parseDouble(parts[3]));
            }
            managerCount++;
        }

        File fileEmployees = new File("C:\\MainFiles\\projects\\university\\java_labs\\lab11\\InputEmployees.txt");
        Scanner scannerEmployees = new Scanner(fileEmployees);

        Employee[] employees = new Employee[10];
        int employeeCount = 0;

        while (scannerEmployees.hasNextLine()) {
            String[] parts = scannerEmployees.nextLine().split(" ");
            if (parts.length == 4) {
                employees[employeeCount] = new Employee(Integer.parseInt(parts[0]), parts[1], parts[2]);
                employees[employeeCount].setManager(managers[Integer.parseInt(parts[3]) - 1]);
            } else {
                employees[employeeCount] = new Employee(Integer.parseInt(parts[0]), parts[1], parts[2]);
            }
            System.out.println(employees[employeeCount].getTopManager());
            employeeCount++;
        }

        try {
            FileOutputStream file = new FileOutputStream("C:\\MainFiles\\projects\\university\\java_labs\\lab11\\Manager.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(managers[0]);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        try {
            FileOutputStream file = new FileOutputStream("C:\\MainFiles\\projects\\university\\java_labs\\lab11\\Employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(employees[0]);
            out.writeObject(employees[1]);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        Employee manager1 = null;

        try {
            FileInputStream file = new FileInputStream("C:\\MainFiles\\projects\\university\\java_labs\\lab11\\Manager.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            manager1 = (Manager)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println(manager1.getName());
        } catch(IOException | ClassNotFoundException ex) {
            System.out.println("IOException is caught");
        }

        Employee employee1 = null;
        Employee employee2 = null;

        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream("C:\\MainFiles\\projects\\university\\java_labs\\lab11\\Employee.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            employee1 = (Employee)in.readObject();
            employee2 = (Employee)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println(employee1.getName() + ", manager: " + employee1.getTopManager());
            System.out.println(employee2.getName() + ", manager: " + employee2.getTopManager());
            System.out.println(employee1.manager.equals(employee1.manager) ? "Equals" : "No");
        } catch(IOException | ClassNotFoundException ex) {
            System.out.println("IOException is caught");
        }
    }
}

