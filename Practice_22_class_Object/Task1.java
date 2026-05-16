package Practice_22_class_Object;

class Cow {
    protected String m_name;
    protected String m_owner;
    protected int m_age;

    Cow(String name, int age, String owner){
        this.m_age = age;
        this.m_name = name;
        this.m_owner = owner;
    }

    protected void makeSound() {
        System.out.println("Moo");
    }
    //Переопределяя equals моя реализация должна быть 
    //1 Рефлексивной. Т.е. объект равен самому себе
    //2 Симметричной
    //3 Транзитивной
    //4 obj != null
    
  @Override
    public boolean equals(Object obj) {
        //1 Рефлексивной.
        if (this == obj) { 
            return true; 
        }
        //4 + проверка на то что сравниываемые объекты экземпляры одного класса
        //Если бы не было бы данной проверки то сравние класса с его подклассом возращало бы true
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Cow other = (Cow) obj;
        
        return m_age == other.m_age &&
               m_name.equals(other.m_name) &&
               m_owner.equals(other.m_owner);
    }

}


