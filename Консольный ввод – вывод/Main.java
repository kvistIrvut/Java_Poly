import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter your name please: ");
        Scanner sc = new Scanner(System.in);
        String nm = sc.next();
        System.out.println("Hello, " + nm);
        sc.close();
    }
}
