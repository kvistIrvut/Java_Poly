package Practice_38_Scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
