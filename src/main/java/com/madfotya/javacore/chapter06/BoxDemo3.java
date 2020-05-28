package main.java.com.madfotya.javacore.chapter06;
// В этой программе применяется метод, введенный в класс Вох
public class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.heigth = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.heigth = 6;
        mybox2.depth = 9;

        mybox1.volume();
        mybox2.volume();
    }
}
