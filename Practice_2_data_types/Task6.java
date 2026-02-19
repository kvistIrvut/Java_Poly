package Practice_2_data_types;

public class Task6 {
    public static void main(String arg[]){ 
        //Сужение от double к float, потеря точности
        double d1 = 3.141592653589793;
        float f1 = (float) d1;
        System.out.println(f1);

        //Сужение от double к long, отбрасывание дробной части
        double d2 = 123.456;
        long l1 = (long) d2;
        System.out.println(l1);

        //Сужение от long -> int
        long l3 = 100000L;
        int i3 = (int) l3;
        System.out.println(i3);

        //Переход от char к byte, от буквы к числу
        char c1 = 'A';
        byte b3 = (byte) c1;
        System.out.println(b3);

        //Переход от int к char, целое число в символ
        int i6 = 65;
        char c3 = (char) i6;
        System.out.println(c3);

        //Сужение от long к double 
        long l5 = 123456789012345L;
        double d4 = (double) l5;
        System.out.println(d4);
    }
}