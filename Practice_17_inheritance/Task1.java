package Practice_17_inheritance;

//Ключевое слово this указывает что метод обращение идет к конктреному экземплеяру класса
//Ключевое слово super используется для доступа к методам и полям родительского класса. Т.е. 


class A {
    //Данное поле и метод будет наследоватся подклассами, в том и только в том случае если они лежит в одном package 
    int a1;
    void method1() {
        //
    }
    //Наследуется и доступен всегда
    public int a2;
    public void method2() {
        //
    }
    //Наследуется, но доступен только внутри класса
    protected int a3;
    protected void method3() {
        //
    }
    //Не наследуется вовсе
    private int a4;
    private void method4() {
        //
    }

}

    class B extends A {
    //
    }

    class C extends B {
    //
}

