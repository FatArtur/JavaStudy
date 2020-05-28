package main.java.com.madfotya.javacore.chapter09;
interface AA {
    void meth1();
    void meth2();
}
interface BB extends AA{
    void meth3();
}
class MyClass implements BB{
    public void meth1() {
        System.out.println("Peaлизaция метода meth1().");
    }

    public void meth2() {
        System.out.println("Peaлизaция метода meth2().");
    }

    public void meth3() {
        System.out.println("Peaлизaция метода meth3().");
    }
}

class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();

    }
}
