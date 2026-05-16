package Practice_27_default_static_in_interfaces;

interface Interface {
    static String A = "AAAAAAA";
    public static void printA(){
        System.out.println(A);
    }
    
    public default void printB(){
        System.out.println("BBBBB");
    }

}

class Printer implements Interface{
    @Override
    public void printB() {
        System.out.println("bbbbb");    
    }
}

public class Task1 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Interface inter =  printer;

        printer.printB();

        Interface.printA();
        inter.printB();
    }
    
    
}
