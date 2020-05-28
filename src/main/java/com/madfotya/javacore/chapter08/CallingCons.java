package main.java.com.madfotya.javacore.chapter08;
// Продемонстрировать порядок вызова конструкторов
class C extends B{
    C() {
        System.out.println("B конструкторе С.");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
