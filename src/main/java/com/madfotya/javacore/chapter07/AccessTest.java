package main.java.com.madfotya.javacore.chapter07;
// емонстрируется отличие модификаторов private и public
public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        ob.a = 10;
        ob.b = 20;

        // ob.c = 100; // ОШИБКА!

        ob.setc(100);
        System.out.println("a, b, и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
