package main.java.com.madfotya.javacore.chapter06;
// В этом классе определяется целочисленный стек, в котором
// можно хранить до 10 целочисленных значений
class Stack {
    private int stck[] = new int [10];
    private int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // разместить элемент в стеке
    void push (int item) {
        if (tos == 9)
            System.out.println("Стек заполнен.");
        else stck[++tos] = item;
    }
    // извлечь элемент из стека
    int pop(){
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else return stck[tos--];
    }
}
