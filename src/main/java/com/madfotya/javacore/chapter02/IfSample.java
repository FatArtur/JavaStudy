package main.java.com.madfotya.javacore.chapter02;
/*
    Продемонстрировать применение условного оператора if .
 */
public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y");

        x = x *2;
        if (x == y) System.out.println("x теперь равно у");

        x = x *2;
        if (x > y) System.out.println("x теперь больше у");

        if (x == y) System.out.println("вы не увидите этого");

    }
}
