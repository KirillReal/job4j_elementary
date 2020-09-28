package ru.job4j.condition;

public class NegativeNumber {
    public static void main(String[] args) {
       negative(4);
       negative(-4);
    }
    public static void negative(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}

