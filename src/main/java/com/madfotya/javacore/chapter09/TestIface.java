package main.java.com.madfotya.javacore.chapter09;

class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
