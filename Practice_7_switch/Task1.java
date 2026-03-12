package Practice_7_switch;

import java.util.Scanner;

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

        int value = scan.nextInt();

        i = 0;
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



        scan.close();
    }
}
