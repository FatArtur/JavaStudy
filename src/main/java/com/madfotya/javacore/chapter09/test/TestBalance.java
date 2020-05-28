package main.java.com.madfotya.javacore.chapter09.test;
import main.java.com.madfotya.javacore.chapter09.*;
class TestBalance {
    public static void main(String[] args) {
        // Класс Balance объявлен как puЬlic, поэтому им можно
        // воспользоваться и вызвать его конструктор.
        Balance test = new Balance("J. J. Jasper", 99.88);
        test.show();
    }
}
