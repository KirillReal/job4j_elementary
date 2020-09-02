package ru.job4j;

public class TrArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double multiplication = p * (p - a) * (p - b) * (p - c);
        double rsl = Math.sqrt(multiplication);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
