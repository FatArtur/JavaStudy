package main.java.com.madfotya.javacore.chapter08;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5,7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Oбъeм weightbox равен " + vol);
        System.out.println("Вec weightbox равен " + weightbox.weight);
        System.out.println();

        plainbox = weightbox;
        vol = plainbox.volume(); // Верно, т.к. метод volume() определен в классе Вох
        System.out.println("Oбъeм plainbox равен " + vol);
        // Следующий оператор ошибочен, поскольку член plainbox не определяет член weight .
        // System.out.println("Вec plainbox равен " + plainbox.weight);
    }
}
