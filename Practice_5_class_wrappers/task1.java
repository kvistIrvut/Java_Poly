package Practice_5_class_wrappers;

public class task1 {
    public static void main(String[] args) {
        //Метод decode существует только у целочисленных классов-оболочек
        //Так же этот метод может переводить зн-ния из 8-ой, 16-о1 систем счисления в 10-ую
        Integer dec = Integer.decode("52");
        System.out.println("52 in decimal = " + dec + " decimal");
        Integer oct = Integer.decode("052");
        System.out.println("52 in octal  = " + oct + " decimal");
        Integer hex = Integer.decode("0x52");
        System.out.println("52 in hex = " + hex + " decimal");
    }
}
