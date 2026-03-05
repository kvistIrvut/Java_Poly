package Practice_4_Operators;

public class Task1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 4;
        System.out.println("a = " + a + ", b = " + b);
    
        //Арифметические операторы
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + sub);
        System.out.println("a * b = " + mul);
        System.out.println("a / b = " + div);
        System.out.println("a % b = " + mod);

        //Операторы сравнения
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " +(a >= b));
        System.out.println("a <= b = " + (a <= b));

        //Логические операторы
        System.out.println("true && false = " + (true && false));
        System.out.println("true || false = " + (false || true));//Поменял местами чтобы код Java проверяла оба операнда
        System.out.println("!false = "+ !false);
        System.out.println("!true = "+ !true);

        //Побитовые операторы
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + ~a);

        //Операторы сдвига
        System.out.println("a = " + a);
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1));

        //Конкатенация строк
        String name = "Alex";
        int age = 20;
        
        String text = "Name: " + name + ", Age: " + age;
        System.out.println(text);

        //Унарные операторы
        int n = 5;
        int g = 3;
        System.out.println("n = "+n + ", g = "+ g);
        System.out.println("g + ++n = " + (g + ++n)); 
        System.out.println("n = "+n);
        System.out.println("g + n++ = " + (g + n++)); 
        System.out.println("n = "+n);
        System.out.println("g + --n = " + (g + --n));
        System.out.println("n = "+n);
        System.out.println("g + n-- = " + (g + n--));
        System.out.println("n = "+n);
        System.out.println("-n = " + -n);

        

        //Присвоение с разными модификаторами
        int value = 10;

        value += 5; // value = value + 5
        value -= 3; // value = value - 3
        value *= 2; // value = value * 2
        value /= 4; // value = value / 4
        value %= 3; // value = value % 3

        value &= 2;
        value |= 1;
        value ^= 3;

        value <<= 1;
        value >>= 1;
        value >>>= 1;


      

        //Круглые скобки ()
        int result_round = (a + b) * 2;
        int result_no = a + b * 2;
        System.out.println("a + b * 2" + result_no);
        System.out.println("(a + b) * 2" + result_round);

    }

 
}
