package Practice_2_data_types;

public class Task7 {
    public static void main(String[] args) {
        int a = 120;
        byte b = a + 10;
        byte c = (byte)(a + 10);
        byte d = a + 1;
        //В данном коде в 1 и 2 примере идет перполнение типа данных byte так как он вмещает в себя целые числа от -2^7 до 2^7 - 1
        //Но в моем случае JCC не дает скомпелировать код для 1 и 3 примеров так как он видит несооответсвие типов
        //Только во 2 примере верно приведенно сужение типов и получается число -126
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
