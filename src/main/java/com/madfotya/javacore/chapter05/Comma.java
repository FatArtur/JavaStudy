package main.java.com.madfotya.javacore.chapter05;

public class Comma {
    public static void main(String[] args) {
        int a, b;
        b = 4;
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
