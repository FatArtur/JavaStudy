package main.java.com.madfotya.javacore.chapter03;
//Скомпилировать эту программу нельзя
public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {               //создается новая область действия
           // int bar = 2;// Ошибка в компиляции -
                        // переменная bar уже оперделена!
        }
    }
}
