package main.java.com.madfotya.javacore.chapter08;
// Динамическая диспетчеризация методов
class Dispatch {
    public static void main(String[] args) {
        AA a = new AA();
        BB b = new BB();
        CC c = new CC();

        AA r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();

    }
}
