package Practice_11_methods;

import java.util.Scanner;

class Printer {
    
    public void printOut(){
        System.out.println("Nothing to print");
        return;
    }
    //Перегружаю функцию printOut чтобы выводились
    //полученные на вход строки
    public void printOut(String str){
        System.out.println(str);
        return;
    }
}

class ScanerPrinter extends Printer{
    //Для подскласса scaner_printer переопределяю функцию printOut, так чтобы сначала пользователь вводил 
    //текст затем уже получал вывод
    @Override
    public void printOut() {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    System.out.println(str);
    scan.close();
    return;
    }

}

public class Task1 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printOut();
        printer.printOut("Go Fuck Yourself");    
        ScanerPrinter sp = new ScanerPrinter();
        sp.printOut();
    }
    
    
}
