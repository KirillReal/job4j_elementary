package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) { // i - номер текущего шага
            int min = MinDiapason.findMin(data, 0, data.length - 1);
            int index = FindLoop.indexOf(data, min, 0, data.length - 1);
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] < min) {
                    index = i;
                    min = data[i];
                }
            }
            data[index] = data[i];
            data[i] = min;
        }
        return data;
    }
}
