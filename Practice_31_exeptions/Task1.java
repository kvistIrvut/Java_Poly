package Practice_31_exeptions;
//Классы Error показывает ошибки свзанные с системой. В коде не обрабатывается
//Exeption - Ошибки возможные к обработке внутри кода
//RuntimeException - данные ошибки зачатую связанны с ошибкой программиста в логике кода 
public class Task1 {
    public static void stringPrint(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a;
        try {
            a = 2/0;
        } catch (ArithmeticException e) {
            a = 0;
        }
        System.out.println(a);
        
        int[] arr = {1};
        try {
            a = arr[2];
        } catch (ArrayIndexOutOfBoundsException e){
            a = 1;
        }
        System.out.println(a);
        
        try {
            stringPrint(2.0);
        } catch (IllegalArgumentException e){
            stringPrint(3);
        }

        try {
            Object sad = "sad";
            a = (int) sad;
        } catch (ClassCastException e){
            System.out.println(3);
        }

        try {
            Integer b = null;
            a = b;
        } catch (NullPointerException e) {
            System.out.println(4);
        }


    }   
}
