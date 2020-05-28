package main.java.com.madfotya.javacore.chapter07;
// Продемонстрировать применение внутреннего класса
class Outer{
    int outer_x = 100;

//    void test(){
//        Inner inner = new Inner();
//        inner.display();
//    }
//
//    class Inner{
//        int y = 10;
//        void display() {
//            System.out.println("вывoд: outer_х = " + outer_x);
//        }
//    }
    void test(){
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("вывoд: outer_х = " + outer_x);
                }
            }

                Inner inner = new Inner();
                inner.display();
        }
    }

//    void showy(){
////        System.out.println(y); //Error
//    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
