package com.company;

public class Expression {
    byte b = 42;
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = .1234;
    double result;

    public Expression() {
        this.calculate();
    }

    public void calculate() {
        int c = (int)(0.5 + b);

        this.result = (f * b) + (i / c) - (d * s);
    }

    public void printResult() {
        System.out.println("Result: " + this.result);
    }

    public void increment() {
        int a, b = 5, c = 7, d = 9;
        a = b++ + c++ + ++d;
        System.out.println("Increment: " + a);
    }

    public void testInfinity() {
        System.out.println("Infinity: " + 1f / 0f);
        System.out.println("Infinity: " + -1d / 0d);
    }

    public void getNaN() {
        System.out.println("Infinity: " + 0.0 / 0.0);
        System.out.println("Infinity: " + (1.0 / 0.0) * 0.0);
    }

    public void getHypotenuse() {
        double a = 5, b = 6;
        double result;

        result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Hypotenuse: " + result);
    }
}
