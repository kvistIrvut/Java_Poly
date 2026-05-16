package Practice_36_Static_Init_Errir;

    public class App {
    final static int START_COUNTER;
    static {
        //Статические блоки инициализируються в момент компиляции соответсвенно поптка привести "Y-" к int приводит к java.lang.NumberFormatException 
        START_COUNTER = Integer.parseInt("Y-");
    }
    
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}



