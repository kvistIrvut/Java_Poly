package Practice_27_default_static_in_interfaces;


interface A {
    public default void print(){
        System.out.println("AAAAA");
    }
}

interface B {
    public default void print(){
        System.out.println("BBBBB");
    }
}
//Если никак эт не хэндлить то будет ошибка компиялции.
//Есть несколько способ, каждый из которых включает в себя @Override
class C implements A,B{
    //1
    @Override
    public void print(){
        A.super.print();
    }

    // //2
    // @Override
    // public void print(){
    //     B.super.print();
    // }

    // //3
    // @Override
    // public void print(){
    //    //Своя реализация
    // }
}

