package day34_GarbageCollection;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers;

    public Circle(double radius) {
        this.radius = radius;

        //pi=3.14;
        System.out.println(pi * radius * radius);

    }

    public static void main(String[] args) {
        new Circle(3.2);
        System.out.println(pi);
    }

    static {

        pi = 3.14;
        name = "Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }
}