package Practice_3_javadoc;

/**
 * Программа для "ковыряния" в javadoc.
 *
 * @author Касимов Александр
 * @version 1
 */
public class Task1 {

    /**
     * Складывает два int числа.
     *
     * @since 1
     * @param a первое число
     * @param b второе число
     * @return сумма двух чисел
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Вычитает одно int число из другого.
     *
     * @since 1
     * @param a число, из которого вычитают
     * @param b число, которое вычитают
     * @return разность двух чисел
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Точка входа в программу.
     *
     * @see Task1#add(int, int)
     * @see Task1#subtract(int, int)
     */
    public static void main(String[] args) {
        Task1 task = new Task1();

        int sum = task.add(10, 5);
        int difference = task.subtract(10, 5);

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
    }
}