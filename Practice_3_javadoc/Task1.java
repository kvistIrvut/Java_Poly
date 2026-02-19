package Practice_3_javadoc;
/**
 * Программа для "ковыряния" в javadoc
 * @author Касимов Александр 
 * @version 1
 * 
 * 
 */


public class Task1 {
    /**
     * @see Складывает два int числа.
     * @since 1
     * @param a первое число
     * @param b второе число
     * @return int сумма 2 чисел
     * @throws typeMismatch
     */
    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        
    }
}
