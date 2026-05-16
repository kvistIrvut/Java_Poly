package Practice_23_inner_classes;

class SomeClass {
    private int privateField = 10; 
    protected int protectedField = 20; 
    public int publicField = 30; 
    private void privateMethod() {
         System.out.println("private method");
    }
    //Внутренний класс имеет доступ ко всем методам и полям не смотря на их спецефикатор доступа
    public class Inner {
        public void show() {
            System.out.println(privateField);
            System.out.println(protectedField); 
            System.out.println(publicField); 
            
            privateMethod();
        }
    }

}

public class Task2 {
    public static void main(String[] args) {

        SomeClass.Inner in = new SomeClass().new Inner();
        in.show();
    }
}
