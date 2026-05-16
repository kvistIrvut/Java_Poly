package Practice_29_stringbuilder_stringBuffer;

public class Task2 {
    public static void main(String[] args) {
        //Str -> SBF/SBL
        String str = "Hello";

        // Через конструктор
        StringBuilder sb = new StringBuilder(str);
        StringBuffer sbf = new StringBuffer(str);
        
        //Обратное через преобразование в строку
        String str1 = sb.toString();
        String str2 = sbf.toString();
    }
}
