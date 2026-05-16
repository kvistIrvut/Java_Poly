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

public class Task2 {

    //Указывая что Wrapper наследник Number получается возможность хранить данные из Wrapper в Number
    public void printWrapper(Wrapper<? extends Number> wrapper) {
        Number value = wrapper.getItem(); 
        System.out.println("printWrapper: " + value);

    }
    //Указывая что Wrapper применим Number и его предков получается возможность хранить данные из Wrapper в Number
    public void fillWrapper(Wrapper<? super Integer> wrapper) {
        wrapper.setItem(100);

        Object value = wrapper.getItem();//Поскольку используется wildcard то можно использовать класс от которого наследуются, 
        //от Object наследуются все классы 
        System.out.println("fillWrapper: " + value);
    }
    public static void main(String[] args) {

        //Пример extends
        Wrapper<Integer> intWrapper = new Wrapper<>();
        intWrapper.setItem(42);

        //Пример super
        Wrapper<Number> numberWrapper = new Wrapper<>();

        fillWrapper(numberWrapper); 

    }
}