package com.company;

import java.util.Arrays;

public class Vector {

    public int[] array;
    public int dimension;

    /**
     *
     * @param dimension size of an array
     */
    public void setDimension(int dimension) {
        this.dimension = dimension;
        int[] copy = new int[dimension];

        if (this.array != null) {
            for (int i = 0; i < this.array.length; i++) {
                copy[i] = this.array[i];
                this.array = copy;
            }
        }

        this.array = copy;
    }

    /**
     *
     * @param index index of element in array
     * @param value value for the element
     */
    public void setElement(int index, int value) {
        this.array[index] = value;
    }

    /**
     *
     * @param index index of element in array
     * @return number
     */
    public int getElement(int index) {
        return this.array[index];
    }

    /**
     *
     * Возвращает новый вектор который хранит в себе
     * результат додавания элементов
     * @return vector
     */
    public Vector add(Vector vector) {
        Vector result = new Vector();

        result.setDimension(this.dimension);
        for (int i = 0; i < vector.array.length; i++) {
            result.setElement(i, this.getElement(i) + vector.getElement(i));
        }
        return result;
    }

    /**
     *
     * Возвращает новый вектор который хранит в себе
     * результат умножения элементов
     * @return vector
     */
    public Vector multiply(Vector vector) {
        Vector result = new Vector();
        result.setDimension(this.dimension);
        for (int i = 0; i < vector.array.length; i++) {
            result.setElement(i, this.getElement(i) + vector.getElement(i));
        }
        return result;
    }

    /**
     *
     * Возвращает новый вектор который хранит в себе
     * результат деления элементов
     * @return vector
     */
    public Vector divide(Vector vector) {
        Vector result = new Vector();
        result.setDimension(this.dimension);
        for (int i = 0; i < vector.array.length; i++) {
            result.setElement(i, this.getElement(i) / vector.getElement(i));
        }
        return result;
    }

    /**
     *
     * Возвращает новый вектор который хранит в себе
     * результат отнимания элементов
     * @return vector
     */
    public Vector deduct(Vector vector) {
        Vector result = new Vector();
        result.setDimension(this.dimension);
        for (int i = 0; i < vector.array.length; i++) {
            result.setElement(i, this.getElement(i) - vector.getElement(i));
        }
        return result;
    }

    /**
     *
     * Метод используется для вывода вектора в формате [1,2,3,4,5]
     */
    public void print() {
        System.out.println(Arrays.toString(this.array));
    }
}
