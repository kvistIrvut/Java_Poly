package Practice_23_inner_classes;

class SomeClass {

    class Inner {
        private int privateField = 10; 
        protected int protectedField = 20; 
        public int publicField = 30;

        private void innerMethod() {
            System.out.println("Inner private method");
        }
    }
    //Внешний класс имеет доступ ко всем методам и полям внутреннего не смотря на их спецефикатор доступа
    public void show() {
        Inner inner = new Inner();

        System.out.println(inner.privateField);
        System.out.println(inner.protectedField);
        System.out.println(inner.publicField);
        inner.innerMethod();
    }
}

public class Task3 {
    public static void main(String[] args) {
        SomeClass some = new SomeClass();
        some.show();
    }
}
