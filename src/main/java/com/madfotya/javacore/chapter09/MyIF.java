package main.java.com.madfotya.javacore.chapter09;

public interface MyIF {
    int getNumber();

    default String getString(){
        return "Объект типа String по умолчанию";
    }
    static int getDefaultNumber(){
        return 0;
    }
}
