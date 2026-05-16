package Practice_30_formtinh_str;

import java.util.Date;

public class Task3 {
    public static void main(String[] args) {
        Date now = new Date();
        
        System.out.printf("Текущее время: %tH:%tM:%tS%n", now, now, now);

        System.out.printf("Дата: %tB %tY%n", now, now);
    }
}
