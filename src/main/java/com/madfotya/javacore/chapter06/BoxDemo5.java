package main.java.com.madfotya.javacore.chapter06;
// В этой программе применяется метод с параметрами
public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        vol=mybox1.volume();
        System.out.println("Объeм равен " + vol);
        vol=mybox2.volume();
        System.out.println("Объeм равен " + vol);
    }
}
