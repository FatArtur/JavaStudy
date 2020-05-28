package main.java.com.madfotya.javacore.chapter09;
// Определить интерфейс для целочисленного стека
interface IntStack {
    void push(int item); // сохранить элемент в стеке
    int pop();          // извлечь элемент из стека

    default void clear(){
        System.out.println("Meтoд clear ( ) не реализован .");
    }
}
