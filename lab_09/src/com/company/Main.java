package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter type: ");
            String type;
            type = scanner.next();

            if (type.equals("Manager")) {
                System.out.print("Enter manager id: ");
                int id = scanner.nextInt();
                Manager manager = new Manager(id, "Manager", "№" + id, 100);
                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();
                manager.setSalary(salary);
            } else {
                System.out.print("Enter employee id: ");
                int id = scanner.nextInt();
                System.out.print("Enter employee first name: ");
                String firstName = scanner.next();
                System.out.print("Enter employee last name: ");
                String lastName = scanner.next();
                Employee employee = new Employee(id, firstName, lastName);
                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();
                employee.setSalary(salary);
            }
        }
    }
}
