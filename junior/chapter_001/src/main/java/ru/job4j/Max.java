package ru.job4j;

public class Max {
    public int sum(int first, int second) {
        return first + second;
    }

    public int max(int first, int second) {
        return (first > second) ? first : second;

    }

    public int max1(int first, int second, int third) {


            return Math.max(first, Math.max(second, third));

    }
}
