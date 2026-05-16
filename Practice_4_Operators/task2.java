package Practice_4_Operators;

class Shape {}

class Number {}

class EvenNumber extends Number {}

public class Task2 {
    public static void main(String[] args) {
        EvenNumber even = new EvenNumber();
        System.out.println("even instanceof EvenNumber = " + (even instanceof EvenNumber) ); 
        System.out.println("even instanceof Number = " + (even instanceof Number) );
        System.out.println("even instanceof Shape = " + (even instanceof Shape));
        
        //Проверка работы с null-объектом
        EvenNumber nullObj = null;
        System.out.println("nullPtr instanceof EvenNumber = " + (nullObj instanceof EvenNumber));
        System.out.println("nullPtr instanceof EvenNumber = " + (nullObj instanceof Number));
    }
}
