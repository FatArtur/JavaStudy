package main.java.com.madfotya.javacore.chapter09;
// Еще одна реализация интерфейса Callback
class AnotherClient implements Callback{
    public void callback(int p){
        System.out.println("Eщe один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}


class TestIface2 {
    public static void main(String[] args) {
        Callback c =new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;

        c.callback(42);
    }
}
