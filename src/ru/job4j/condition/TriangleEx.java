package ru.job4j.condition;

public class TriangleEx {
    public static boolean exist(double ab, double ac, double bc) {
       return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
    public static void main(String[] args) {
      boolean file =  TriangleEx.exist(4.0, 5.0, 7.0);
      System.out.println(file);
      boolean not = TriangleEx.exist(2.0, 2.0, 5.0);
      System.out.println(not);
    }
}
