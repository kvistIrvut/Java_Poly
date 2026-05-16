package Practice_24_nested_classes;

interface Interface {
    class Inner {
        public void show() {
            System.out.println("Inner class of interface");
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Interface.Inner in = new Interface.Inner();
        in.show();
    }
}
