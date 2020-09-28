package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean yes = left >= right;
        int result = yes ?  left : right;
        return result;
    }
    public static void main(String[] args) {
        int msg = Max.max(4, 5);
        System.out.println(msg);
    }
}
