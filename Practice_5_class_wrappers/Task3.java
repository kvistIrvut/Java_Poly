package Practice_5_class_wrappers;

public class Task3 {
    public static void main(String[] args) {
        //Такая кофигурация вызывает NullPointerException 
        Boolean nilBool = null;
        boolean someBool = nilBool;
    }
}
