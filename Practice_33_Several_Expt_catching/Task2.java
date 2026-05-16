package Practice_33_Several_Expt_catching;
/*
try {
   ...
} catch (final Exception e) {
   ...
}

слово final не дает менять значние e в обработчике
*/

class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class Task2 {
    public static void main(String[] args) {
     
        try {
            throw new Ex3(); 
        } catch (Ex3 e) {
            System.out.println("Перехвачено Ex3");
        } catch (Ex2 e) {
            System.out.println("Перехвачено Ex2");
        } catch (Ex1 e) {
            System.out.println("Перехвачено Ex1");
        }
    }
}
