package Practice_2_data_types;

public class Task5 {
    public static void main(String arg[]){
        int a = 100;
        long b = 500L;
        long result1 = a + b;  // int расширяется до long
        System.out.println(result1);
                
    
        int i = 7;
        float p  = 15.5f;
        float result2 = i * p;  // int расширяется до float
        System.out.println(result2);
        
        float f = 3.14f;
        double d = 2.5;
        double result3 = f + d;  // float расширяется до double
        System.out.println(result3);
        
        int x = 10;
        double y = 3.5;
        double division = x / y;  // int расширяется до double
        System.out.println(division);
        
        byte byteVal = 10;
        short shortVal = 20;
        int result5 = byteVal + shortVal;  // оба расширяются до int
        System.out.println(result5);
        
        
        byte o = 5;
        short sh = 10;
        int l = 15;
        long n = 20L;
        float fNum = 1.5f;
        double dNum = 2.5;    
        double result6 = o + sh + n + l + fNum + dNum; //Расширение всех до double
        System.out.println(result6);
    }
}
