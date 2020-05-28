package main.java.com.madfotya.javacore.chapter08;
// Переопределение метода
class AA {
    int i, j;
    AA(int a, int b) {
        i = a;
        j = b;
    }
    AA(){}

    void show(){
        System.out.println("i и j: " + i + " " + j);
    }

    void callme(){
        System.out.println("B методе callme() из класса АA");
    }
}
class BB extends AA{
    int k;

    BB(){}

    BB(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // переопределение
//    void show() {
//        super.show();
//        System.out.println("k: " + k);;
//    }

    // перегрузить метод show()
    void show(String msg){
        System.out.println(msg + k);
    }
    void callme(){
        System.out.println("B методе callme() из класса BB");
    }
}

class CC extends AA{
    CC() {}
    void callme(){
        System.out.println("B методе callme() из класса CC");
    }
    void tsetCC(){
        System.out.println("OK");
    }

}

class Override {
    public static void main(String[] args) {
        BB subOb = new BB(1, 2, 3);
        subOb.show("Это k:");
        subOb.show();
    }
}
