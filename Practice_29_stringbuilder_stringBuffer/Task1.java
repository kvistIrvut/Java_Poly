package Practice_29_stringbuilder_stringBuffer;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Добавление текста в конец
        sb.append(" World");
        System.out.println(sb);

        // Вставка строки в указанную позицию
        sb.insert(5, ",");
        System.out.println(sb);

        // Замена части строки
        sb.replace(0, 5, "Hi");
        System.out.println(sb);

        // Удаление диапазона символов
        sb.delete(2, 4);
        System.out.println(sb);

        // Удаление одного символа
        sb.deleteCharAt(1);
        System.out.println(sb);

        // Переворот строки
        sb.reverse();
        System.out.println(sb);

        // Получение символа по индексу
        System.out.println(sb.charAt(0));

        // Получение длины строки
        System.out.println(sb.length());

        // Изменение символа
        sb.setCharAt(0, 'X');
        System.out.println(sb);

        // Получение подстроки
        System.out.println(sb.substring(0, 2));


        
        StringBuffer sbf = new StringBuffer("Java");

        // Добавление текста
        sbf.append(" Programming");
        System.out.println(sbf);

        // Вставка текста
        sbf.insert(4, " Core");
        System.out.println(sbf);

        // Замена части строки
        sbf.replace(0, 4, "JVM");
        System.out.println(sbf);

        // Удаление диапазона
        sbf.delete(3, 7);
        System.out.println(sbf);

        // Удаление символа
        sbf.deleteCharAt(1);
        System.out.println(sbf);

        // Переворот строки
        sbf.reverse();
        System.out.println(sbf);

        // Получение текущей ёмкости
        System.out.println(sbf.capacity());

        // Установка новой длины строки
        sbf.setLength(5);
        System.out.println(sbf);

        // Получение символа
        System.out.println(sbf.charAt(0));

        // Получение подстроки
        System.out.println(sbf.substring(0, 3));
    }
}
