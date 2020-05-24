package com.company;

public class Subject {
    String name;
    float mark;
    boolean passed;

    public Subject(String name) {
        this.name = name;
        this.mark = Utils.getRandomInteger(5, 2);
        this.passed = this.mark > 2;
    }

    public String getName() {
        return name;
    }

    public float getMark() {
        return mark;
    }
}
