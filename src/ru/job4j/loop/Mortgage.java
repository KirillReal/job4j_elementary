package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, int percent) {
        int year = 1;
        double res = amount + (amount * percent / 100) - salary;
        while (res > 0) {
            res = (res + (res * percent / 100)) - salary;
            year = year + 1;

        }
            return year;
    }

}
