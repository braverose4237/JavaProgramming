package day34_GarbageCollection;

public class Staticblock {
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
    static {
        System.out.println("Static Block");
    }
    static {
        System.out.println("2.Static Block");
    }
}
