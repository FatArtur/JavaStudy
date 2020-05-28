package main.java.com.madfotya.javacore.chapter08;
// Простой пример абстракции
abstract class AAA{
    abstract void callme();
    // абстрактные классы все же могут содержать конкретные методы
    void callmetoo(){
        System.out.println("Этo конкретный метод .");
    }
}

class BBB extends AAA{
    void callme() {
        System.out.println("Peaлизaция метода callme() из класса B. ");
    }
}

public class AdstractDemo {
    public static void main(String[] args) {
        BBB b = new BBB();

        b.callme();
        b.callmetoo();
    }
}
