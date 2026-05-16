package Practice_37_IO_streams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        //По аналогии с Task1 перенаправляю вывод значений
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()){
            output.write(1); 
            output.write(2); 
            output.write(3);
            byte[] result = output.toByteArray();
            for (byte i: result){
                System.out.println(i);
            }
            output.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
