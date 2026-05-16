package Practice_32_exept_catching;

public class Task2 {
    public static void main(String[] args) {
        int a;
        try {
            a = 2/0;
        } catch (ArithmeticException e) {
            a = 0;
        }
        System.out.println(a);
        
        int[] arr = {1};
        a = arr[2];
        System.out.println(a);
    }
}
