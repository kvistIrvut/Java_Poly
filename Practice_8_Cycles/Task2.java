package Practice_8_Cycles;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            if (i%2 == 0)
                continue;
            if (i%5 == 3)
                i +=10;
            if (i==19)
                break;
            System.out.println(i);

        }
    }
}
