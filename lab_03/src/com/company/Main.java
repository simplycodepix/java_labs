package com.company;

public class Main {

    public static void main(String[] args) {
        Vector vector1 = new Vector();
        Vector vector2 = new Vector();

        int dimension = Integer.parseInt(args[0]);
        vector1.setDimension(dimension);
        vector2.setDimension(dimension);

        for (int i = 1; i < args.length; i++) {
            vector1.setElement(i - 1, Integer.parseInt(args[i]));
            vector2.setElement(i - 1, Integer.parseInt(args[i]));
        }

        vector1.print();
        vector2.print();

        Vector vector3 = vector1.add(vector2);
        Vector vector4 = vector1.multiply(vector2);
        Vector vector5 = vector1.divide(vector2);
        Vector vector6 = vector1.deduct(vector2);

        vector3.print();
        vector4.print();
        vector5.print();
        vector6.print();
    }
}
