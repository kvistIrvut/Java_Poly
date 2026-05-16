package Practice_14_Paramed;

class Wrapper<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Wrapper<Float> a = new Wrapper<>();

        System.out.println(a instanceof Wrapper);//Проверка на принадлежность к обобщенному классу
        System.out.println(a instanceof Wrapper<?>);//Проверка на принадлежность классу c каким то подстановочным типом (wildecard)
    }
}
