package main.java.com.madfotya.javacore.chapter07;
// Объекты допускается передавать методам в качестве параметров
class Test {
    int a;
    public int b;
    private int c;

    Test(int i){
        a = i;
    }

    Test incrByTen(){
        Test temp = new Test(a + 10);
        return temp;
    }

    Test() {}

    Test(int i, int j){
        a = i;
        b = j;
    }

    boolean equals(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
    void  meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
    void  meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    void setc(int i) {
        c = i;
    }
    int getc(){
        return c;
    }
}
class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));
    }
}
