package main.java.com.madfotya.javacore.chapter08;
// Расширение класса BoxWeiqht включением в него
// поля стоимости доставки
class Shipment extends BoxWeight{
    double cost;

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("Oбъeм shipment1 равен " + vol);
        System.out.println("Bec shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Oбъeм shipment2 равен " + vol);
        System.out.println("Bec shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки $" + shipment2.cost);

    }
}
