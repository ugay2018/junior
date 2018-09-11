package ru.job4j;

public class BubbleSort {

    public int[] arr(int[] variable) {
        int temp = 0;
        for (int i = 0; i < variable.length; i++) {
            for (int j = 0; j < variable.length - i - 1; j++) {
                if (variable[j] > variable[j + 1]) {
                    int tmp = variable[j + 1];
                    variable[j] = variable[j + 1];
                    variable[j + 1] = tmp;
                }
            }
        }
        return variable;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = bubbleSort.arr(new int[]{2, 5, 3, 1});
        System.out.println(arr);
    }
}
