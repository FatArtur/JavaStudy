package main.java.com.madfotya.javacore.chapter08;

class A{
    int i;
    private int j;

    void  setij(int x, int y){
        i = x;
        j = y;
    }
    A(){
        System.out.println("B конструкторе А.");
    }
}

class B extends A{
    int total;
    int i; // этот член i скрывает член i из класса А

    B(int a, int b){
        super.i = a; // член i из класса А
        i = b;       // член i из класса В
    }
    B(){super();
        System.out.println("B конструкторе В.");}

    void show(){
        System.out.println("Члeн i в суперклассе: " + super.i);
        System.out.println("Члeн i в подклассе: " + i);
    }

    void sum(){
        //total = i + j; Error член j в этом классе недоступен
    }
}

public class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Cyммa равна " + subOb.total);
    }
}
