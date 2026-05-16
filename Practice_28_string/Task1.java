package Practice_28_string;



public class Task1 {
    public static void main(String[] args) {
        String str = "  Hello World  ";
        String str2 = "hello world";

        //1. Возвращает длину строки
        System.out.println(str.length());

        //2. Удаляет пробелы в начале и конце строки
        System.out.println(str.trim());

        //3. Переводит строку в нижний регистр
        System.out.println(str.toLowerCase());

        //4. Переводит строку в верхний регистр
        System.out.println(str.toUpperCase());

        //5. Возвращает символ по индексу
        System.out.println(str.charAt(2));

        //6. Возвращает подстроку начиная с индексап 2 до индекса 7 в даном случае   
        System.out.println(str.substring(2, 7));

        //7. Проверяет, содержит ли строка подстроку
        System.out.println(str.contains("World"));

        //8. Сравнение строк с учетом регистра
        System.out.println(str.trim().equals(str2));

        //9. Сравнение без учета регистра
        System.out.println(str.trim().equalsIgnoreCase(str2));

        //10. Разбивает строку на массив по разделителю
        String[] words = str2.split(" ");
        System.out.println("split:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

