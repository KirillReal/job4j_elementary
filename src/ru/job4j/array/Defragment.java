package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int j = index;  j < array.length; j++) {
                    if (array[j] != null) {
                        String temp = array[j];
                        array[j] = array[index];
                        array[index] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
            String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(input);
            System.out.println();
            for (int index = 0; index < compressed.length; index++) {
                System.out.print(compressed[index] + " ");
            }
        }
}



