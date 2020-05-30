package com.company;

public class Manager extends Employee {
    double bonus;

    public Manager(int id, String firstName, String lastName, double bonus) {
        super(id, firstName, lastName);
        this.setBonus(bonus);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    public String toString() {
        return "ID: " + super.getId() + " Name: " + super.getName() + " Salary: " + this.getSalary() + " Manager: " + super.getManagerName();
    }
}
