package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        double sum = Math.pow(x, 2) + Math.pow(y, 2);
        double rsl = Math.sqrt(sum);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 1, 2, 3);
        System.out.println("result (1, 1) to (2, 3) " + result);
        double result2 = Point.distance(2, 2, 6, 7);
        System.out.println("result (2,2) to (6,7) " + result2);
    }
}
