package Practice_2_data_types;

public class Task1 {
    public static void main(String[] args) {
        
        byte maxValueByte = 127;
        System.out.println(maxValueByte);
        byte minValueByte = -128;
        System.out.println(minValueByte);
        byte zeroValueByte = 0;
        System.out.println(zeroValueByte);

        short  maxValueShort = 32767;
        short  minValueShort = -32768;
        short zeroValueShort = 0;
        System.out.println(maxValueShort);
        System.out.println(minValueShort);
        System.out.println(zeroValueShort);

        int  maxValueInt = 2147483647;
        int  minValueInt = -2147483648;
        int zeroValueInt = 0;
        System.out.println( maxValueInt);
        System.out.println( minValueInt);
        System.out.println(zeroValueInt);

        long  maxValueLong = 9223372036854775807L;
        long  minValueLong = -9223372036854775808L;
        long zeroValueLong = 0;
        System.out.println( maxValueLong);
        System.out.println( minValueLong);
        System.out.println(zeroValueLong);

        float probablyMaxValueFloat =  340282356769999999999999999999999999999f; 
        float probablyMinValueFloat = -340282356769999999999999999999999999999f;
        float minusZeroValueFloat   = -0f;
        float plusZeroValueFloat    = 0f;
        System.out.println(probablyMaxValueFloat);
        System.out.println(probablyMinValueFloat);
        System.out.println(minusZeroValueFloat  );
        System.out.println(plusZeroValueFloat   );

        double        someValueDouble = 349999999999999999999999999969999999999999999999999999999d; 
        double   minusZeroValueDouble = -0d;
        double    plusZeroValueDouble = 0d;
        System.out.println(someValueDouble);
        System.out.println(  minusZeroValueDouble);
        System.out.println(   plusZeroValueDouble);

        char aLetter = 'a';
        System.out.println(aLetter);

        char minusSign = '-';
        System.out.println(minusSign);

        char procentSign = '%';
        System.out.println(procentSign);
        
    }
}
