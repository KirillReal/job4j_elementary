package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) { // i - номер текущего шага
            int min = data[i];
            int index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    index = j;
                    min = data[j];
                }
            }
            data[index] = data[i];
            data[i] = min;
        }
        return data;
    }
}
