package main.java.com.madfotya.javacore.chapter09.p1;

class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("конструктор этого же пакета");
        System.out.println("n = " + p.n);

        // доступно только для класса
//         System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
