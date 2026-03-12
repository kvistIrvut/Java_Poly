package Practice_9_arrays;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int a1[] = {2,1,3,4,5};
        int a2[] = {6,7,8,9,10};
        //Arrays.toString(a1) переводит массив a1 в строку
        System.out.println(Arrays.toString(a1));
        //Arrays.binarySearch(a1,3) применяя бинарсный поиск ищет число 3 в массиве a1 
        System.out.println(Arrays.binarySearch(a1,3));
        //Arrays.equals(a1,a2) проверяет поэлементно равентсво элементов
        System.out.println(Arrays.equals(a1,a2));
        
        //Лексеграфически сравнивает массивы
        System.out.println(Arrays.compare(a1, a2)); 

        Arrays.sort(a1);//Сортирует массив a1

    }
}
