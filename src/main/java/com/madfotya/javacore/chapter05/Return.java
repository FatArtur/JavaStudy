package main.java.com.madfotya.javacore.chapter05;
// Продемонстрировать применение оператора return
public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("До возврата.");

        if (t) return;

        System.out.println("Этoт оператор выполняться не будет.");
    }
}
