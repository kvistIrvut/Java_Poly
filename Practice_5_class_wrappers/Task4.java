package Practice_5_class_wrappers;

public class Task4 {
    public static void main(String[] args) {
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        
        //В данном случае Java не производит автораспаковку, а сравнивает ссылки
        //Объекты a1 и b1 лежает в разных учатсках памяти, соответсвенно имееют разные ссылки
        System.out.println("a1==b1 " + (a1 == b1));

        //В оставшихся случаях происходит автораспковка/автоупаковка и по этому происходит сравнение по значению
        System.out.println("a1==i1 " + (a1 == i1));
        System.out.println("b1==i1 " + (b1 == i1));                
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        //В Java есть IntegerCache. Он работает для значений диапазона byte 
        //Создавая a2 в нее присваеватеся значение ссылки на объект из IntegerCache со значением i2
        //Аналогично для b2. Соответсвенно ссылки на будут одинаковыми из за чего возращаемое значение true
        System.out.println("a2==b2 " + (a2 == b2));

        //В оставшихся случаях происходит автораспковка/автоупаковка и по этому происходит сравнение по значению
        System.out.println("a2==i2 " + (a2 == i2));
        System.out.println("b2==i2 " + (b2 == i2));
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));
    }
}
