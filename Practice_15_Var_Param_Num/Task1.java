package Practice_15_Var_Param_Num;

class Printer{
    static public void printNumbers(int number) {
        System.out.println(number);

    }

    static public void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

}

public class Task1 {
    public static void main(String[] args) {
        Printer.printNumbers(0);
        Printer.printNumbers(2,2,3,3);
    }
}
