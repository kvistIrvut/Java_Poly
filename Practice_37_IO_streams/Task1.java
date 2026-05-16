package Practice_37_IO_streams;

import java.io.ByteArrayInputStream;
import java.io.IOException;


public class Task1 {
    public static void main(String[] args) {
        byte[] data = {0, 1 , 2}; 
        int value;
        //Для эмуляции ввода данных пеопределим вводный поток
        try(ByteArrayInputStream input = new ByteArrayInputStream(data);){
            while ((value = input.read()) != -1) {
                System.out.println(value);
            }  
            input.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }   
    }
}
