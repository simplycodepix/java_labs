package com.company;

public class Main {

    public static void main(String[] args) {

        Manager manager1 = new Manager(1, "Manager", "1", 100);
        Manager manager2 = new Manager(2, "Manager", "2", 100);
        manager1.setManager(manager1);

        Employee employee1 = new Employee(1, "Employee", "1");
        employee1.setManager(manager2);
        System.out.println("Employee 1 manager: " + employee1.getManagerName());

        Employee employee2 = new Employee(2, "Employee", "2");
        employee2.setManager(manager2);
        Employee employee3 = new Employee(3, "Employee", "3");
        employee3.setManager(manager1);
        System.out.println("Employee before raise: " + employee3.toString());
        employee3.raiseSalary(10);
        System.out.println("Employee after raise: " + employee3.toString());

        System.out.println(employee3.getManagerName());

        Manager manager3 = new Manager(3, "Manager", "3", 100);
        System.out.println("Manager 3 manager: " + manager3.getManagerName());

        Manager manager4 = new Manager(4, "Manager", "4", 100);
        manager4.setManager(manager3);
        Manager manager5 = new Manager(5, "Manager", "5", 100);
        manager5.setManager(manager4);
        Manager manager6 = new Manager(6, "Manager", "6", 100);
        manager6.setManager(manager5);

        Employee employee4 = new Employee(4, "Employee", "4");
        employee4.setManager(manager6);

        System.out.println(employee4.getTopManager());
    }
}
