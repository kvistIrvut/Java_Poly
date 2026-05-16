package Practice_30_formtinh_str;

public class Task1 {
    public static void main(String[] args) {
        int number = 52;
        double third  = 1.0 / 3.0;
        String text = "Lol";
        boolean flag = true;
        char letter = 'A';

        //целое число
        System.out.printf("%d%n", number);

        //число с плавающей точкой
        System.out.printf("%.15f%n", third);

        //строка
        System.out.printf("%s%n", text);

        //логическое значение
        System.out.printf("%b%n", flag);

        //символ
        System.out.printf("%c\n", letter);
    }
}

