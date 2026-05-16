package Practice_13_Final;

//1 вариант. Прямая инициализация
class A {
    public final int a = 1;

}

//2 вариант. Конструктор, причем если конструкторов несколько то инициализация должна быть в каждом 
class A_1 {
    public final int a;
    A_1(){
        a = 2;
    }
}

//3 вариант. Блок инициализации
class A_2 {
    public final int a;
    {
        a = 3;
    }
}

public class Test1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);

        A_1 a_1 = new A_1();
        System.out.println(a_1.a);

        A_2 a_2 = new A_2();
        System.out.println(a_2.a);
    }
    
}