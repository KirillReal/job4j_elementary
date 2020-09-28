package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int n = array.length;
        int temp;
        for (int index = 0; index < n / 2; index++) {
            temp = array[n - index - 1];
            array[n - index - 1] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
