package main.java.com.madfotya.javacore.chapter07;
// Продемонстрировать применение массивов объектов типа Strinq
public class StringDemo3 {
    public static void main(String[] args) {
        String str[] = { "один", "два", "три"};

        for (int i = 0; i < str.length; i++) {
            System.out.println("str[" + i + "]: " + str[i]);

        }
    }
}
