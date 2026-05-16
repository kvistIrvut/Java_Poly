package Practice_12_Static_methods_field;

public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        A.printVars();//Это возможно так как метод не привязан к объекту, а к классу в целом
        printVars();//Возможно только если внутри класса, т.е. как в данном примере
        
        A a = new A();
        a.printVars();//Естсенный вызов

        A b = null;
        b.printVars();//Такое возможн поскольку метод не привязан к объекту, а к классу в целом
        //поэтмоу вызов даже null объект дает вызвать метод

    }
}



