package main.java.com.madfotya.javacore.chapter07;
//Применить автоматическое преобразование типов к перегрузке
class OverloadDemo2{
    void test(){
        System.out.println("Праметры отсутствуют");
    }

    void test(int a, int b){
        System.out.println("a и b: " + a + " " + b);
    }
    void test(double a){
        System.out.println(
                "Внутреннее преобразование при вызове test (douЬle) a: " + a);
    }
}

public class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);
        ob.test(123.2);
    }
}

