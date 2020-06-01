package com.company;

import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    public Manager manager;

    public Employee(int id, String firstName, String lastName) {
        this.setId(id);
        this.setName(firstName, lastName);
        this.setSalary(1000);
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getManagerName() {
        if (this.manager == null) return "Nomanager";
        return this.manager.getName();
    }

    public String getTopManager() {
        if (this.manager == null) return this.getName();
        return this.manager.getTopManager();
    }

    public String toString() {
        return "ID: " + this.getId() + " Name: " + this.getName() + " Salary: " + this.getSalary() + " Manager: " + this.getManagerName();
    }
}
