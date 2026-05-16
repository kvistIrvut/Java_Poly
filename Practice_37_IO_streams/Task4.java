package Practice_37_IO_streams;

import java.io.IOException;

class Exmpl implements AutoCloseable {
    public void doWork() {
        System.out.println("WORKING");
    }
    
    @Override
    public void close() {
        System.out.println("FREE WORKING RESOURSER");
    }
}



public class Task4 {
    //Исопльзование AutoCloseable позволяет автоматически убирать ипользованные ресурсы при применеии try конструкции
    public static void main(String[] args) {
        try(Exmpl exmpl = new Exmpl()){
            exmpl.doWork();
        }
      
    }
}
