package Practice_5_class_wrappers;

public class task2 {
    public static void main(String[] args) {

        //Конструктор
        Boolean b1 = new Boolean(true);
        System.out.println("new Boolean(true) = " + b1);

        Boolean b2 = new Boolean(false);
        System.out.println("new Boolean(false) = " + b2);


        //Конструктор, но на входе String
        Boolean b3 = new Boolean("true");
        System.out.println("new Boolean('true') = " + b3);

        Boolean b4 = new Boolean("false");
        System.out.println("new Boolean('false') = " + b4);

        Boolean b5 = new Boolean("abc");
        System.out.println("new Boolean('abc') = " + b5); // пример показывает что любое зн-е кроме true будет дававать false


        //Метод valueOf, на входе boolean
        Boolean b6 = Boolean.valueOf(true);
        System.out.println("Boolean.valueOf(true) = " + b6);

        Boolean b7 = Boolean.valueOf(false);
        System.out.println("Boolean.valueOf(false) = " + b7);


        //Метод valueOf, на входе String
        Boolean b8 = Boolean.valueOf("true");
        System.out.println("Boolean.valueOf('true') = " + b8);

        Boolean b9 = Boolean.valueOf("false");
        System.out.println("Boolean.valueOf('false') = " + b9);

        Boolean b10 = Boolean.valueOf("hello");
        System.out.println("Boolean.valueOf('hello') = " + b10);// пример показывает что любое зн-е кроме true будет дававать false


        //Автоупаковка
        Boolean b11 = true;
        System.out.println("Boolean b11 = true => " + b11);

        Boolean b12 = false;
        System.out.println("Boolean b13 = false => " + b12);


        //Константы класса
        Boolean b13 = Boolean.TRUE;
        System.out.println("Boolean.TRUE => " + b13);

        Boolean b14 = Boolean.FALSE;
        System.out.println("Boolean.FALSE => " + b14);
    }
}

