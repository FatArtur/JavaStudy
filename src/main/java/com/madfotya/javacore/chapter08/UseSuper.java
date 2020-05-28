package main.java.com.madfotya.javacore.chapter08;
// Исполь зовать ключевое слово super с целью предотвратить сокрытие имен
class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1,2);

        subOb.show();
    }
}
