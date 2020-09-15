package ru.job4j.array;

public class SortSelected {
    @SuppressWarnings("checkstyle:LeftCurly")
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {    // i - номер текущего шага
            int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoop.indexOf(data, min, 0, data.length);
            for (int j = i + 1; j < data.length; j++) {
                if (data[index] < data[i]) {
                    int temp = min;
                    data[i] = min;
                }
            }
        }
        return data;
    }
}
