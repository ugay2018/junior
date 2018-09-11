package ru.job4j;

/**
 * Элементарный калькулятор
 */
public class Calculator {

private double result;

public void add(double first, double second) {
    this.result = first + second;
    }

public double getResult() {
    return this.result;
    }
}
