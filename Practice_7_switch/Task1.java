package Practice_7_switch;

import java.util.Scanner;

enum Num {
        FST, SEC
    }

public class Task1 {
    public static void main(String[] args) {
        //По аналогии работает с другими целочисленными типами и их классами-оболочками за исключением long, он не применим
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

        int i = 0;
        switch(value) {
            case 1:
                i = 1; 
                break;
            case 2:
                i = 2; 
                break;
            default:
                i = 3; 
                break;
        }

        System.out.println(i);

        //Так же применим char и его класс-оболочка
        char someChar = 'a';
        i = 0;
        switch (someChar) {
            case 'a':
                i = 1;
                break;
            case 'b':
                i = 2;
                break;
            default:
                i = 3;
                break;
        }

        //Так же применим Sring
        String str = scan.nextLine();
        i = 0;
        switch(str) {
            case "FST":
                i = 1; 
                break;
            case "SEC":
                i = 2; 
                break;
            default:
                i = 3; 
                break;
        }

        System.out.println(i);

        //И enum
        
        Num num = Num.FST;

        switch (num) {
            case FST:
                System.out.println("First day");
                break;
            case SEC:
                System.out.println("Second day");
                break;
            
        }

        scan.close();
    }
}
