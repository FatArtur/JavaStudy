package main.java.com.madfotya.javacore.chapter09;
// Реализовать интерфейс МyIF
class  MyIFImo implements MyIF{
    // Реализован метод getNumber()
    // А вызов метода getString разрешается по умолчанию
    public int getNumber() {
        return 100;
    }
}
class  MyIFImo2 implements MyIF{
    // Реализован метод getNumber()
    // А вызов метода getString разрешается по умолчанию
    public int getNumber() {
        return 100;
    }
    public String getString(){
        return "Это другая символьная строка.";
    }
}




class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImo obj = new MyIFImo();

        System.out.println(obj.getNumber());
// Метод getStrinq () также можно вызвать,
        System.out.println(obj.getString());
    }
}
