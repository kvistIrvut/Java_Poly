package Practice_20_overlading_overwriting;

//Пример перегруженного метода. В частности конструктора
class A {
  int a;
  int b;
  int c;
  int z;

  public A() {
    z = 1;
  }

  public A(int a) {
    this();
    this.a = a;
    
  }

  public A(int a, int b) {
    this(a);
    this.b = b;
  }

  public A(int a, int b, int c) {
    this(a,b);
    this.c = c;
  }

  public int getA(int f){
    return this.a + f;
  }

  public int getB(){
    return this.b;
  }
}

//Примеры на отлов ошибко при помощи @Override 
class B extends A {
    //Если у переопределенного метода не сходятся типы возращаемых значений
    @Override
    public double getA(int f){
        return this.a + f;
    }

    //override явно узказыватет на отсутвие вариации метода getA с аргументом double
    //хотя если бы override не написали бы то метод просто бы стал методом класса B
    //и не было бы ошибки
    @Override
    public int getA(double f){
        return this.a + (int) f;
    }
    //override явно узказыватет Сужение видимости 
    @Override
    protected int getB(){
        return this.b;
    }

}

public class Task1 {
    public static void main(String[] args) {
        B b = new B();
        b.getA(4);

    }
}
