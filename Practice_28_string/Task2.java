package Practice_28_string;

import java.util.StringJoiner;

public class Task2 {
    public static void main(String[] args) {
        String str = "  Hello World  ";
        String str2 = "hello world";
        StringJoiner join = new StringJoiner(",");

        //Метод setEmptyValue задает значение по умолчанию для join
        join.setEmptyValue("Hi");
        System.out.println(join);
        

        //Метод add добавляет строки в join. 
        //При применеии на пустой/заданый дефолтным значением join записвает значение строки в join поверх того что было
        join.add(str);
        join.add(str2);
        System.out.println(join);

        String str3 = "Bye World";
        String str4 = "bye world";
        StringJoiner join2 = new StringJoiner(",");

        join2.add(str3);
        join2.add(str4);

        //Сливает значения join join2 в единый join
        join.merge(join2);
        System.out.println(join);

        //3 задания. """""" - способ записать несколько строк в одну 
        String manyStrings = """
                Hi
                world
                Bye 
                world
                """;
        System.out.println(manyStrings);
    }
}
