package Pricatice_6_Conditional_jump_operator;

public class Task1 {
    public static void main(String[] args) {
        int i = 0;
        for (int a = 1; a < 4; a++) {
            i = a == 1 ? i = 1 : a == 2 ? 2 : 3;
            System.out.println("Value a = " + a + ", then i = " + i);
        }
    }
}
