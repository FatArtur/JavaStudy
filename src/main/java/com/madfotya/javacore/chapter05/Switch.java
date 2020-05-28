package main.java.com.madfotya.javacore.chapter05;
// Усовершенствованная версия программы, в которой
// определяется принадлежность месяца времени года
public class Switch {
    public static void main(String[] args) {
        int mouth = 4;
        String season;
        switch (mouth) {
            case 12:
            case 1:
            case 2:
                season = "зиме";
                break;
            case 3:
            case 4:
            case 5:
                season = "весне";
                break;
            case 6:
            case 7:
            case 8:
                season = "лету";
                break;
            case 9:
            case 10:
            case 11:
                season = "осени";
                break;
            default:
                season = "вымышленным месяцам";
        }
        System.out.println("Апрель относится к " + season + ".");
    }
}
