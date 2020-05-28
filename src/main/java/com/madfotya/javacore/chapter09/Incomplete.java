package main.java.com.madfotya.javacore.chapter09;

abstract class Incomplete implements Callback{
    int a, b;

    void show(){
        System.out.println(a + " " + b);
    }
}
