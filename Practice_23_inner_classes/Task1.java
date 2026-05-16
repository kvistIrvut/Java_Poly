package Practice_23_inner_classes;

import Practice_23_inner_classes.SomeClass.DefaultInner;
import Practice_23_inner_classes.SomeClass.ProtectedInner;
import Practice_23_inner_classes.SomeClass.PublicInner;

class SomeClass {
    public class PublicInner {
        public void show() {
            System.out.println("public inner");
        }
    }

    private class PrivateInner {
        void show() {
            System.out.println("private inner");
        }
    }

    protected class ProtectedInner {
        void show() {
            System.out.println("protected inner");
        }
    }

    class DefaultInner {
        void show() {
            System.out.println("default inner");
        }
    }

    
    public void testPrivate() {
        PrivateInner priv = new PrivateInner();
        priv.show(); 
    }
}

class AnotherClass extends SomeClass{}

public class Task1 {
    public static void main(String[] args) {
        SomeClass.PublicInner pubSome = new SomeClass().new PublicInner();
        pubSome.show();

        SomeClass.ProtectedInner protSome = new SomeClass().new ProtectedInner();
        protSome.show();
        
        SomeClass.DefaultInner defSome = new SomeClass().new DefaultInner();
        defSome.show();

        SomeClass someClass = new SomeClass();
        //private inner class доступен только внутри класса (что и ожидалось от private)
        someClass.testPrivate(); 

       

        AnotherClass.PublicInner pubAno = new AnotherClass().new PublicInner();
        pubAno.show();
        //Доступен для всех подклассов не зависимо от места харнения файла с кодом подкласса 
        AnotherClass.ProtectedInner protAno = new AnotherClass().new ProtectedInner();
        protAno.show();
        //Будет доступен только да подклассов данного пакета т.е. Practice_23_inner_classes
        AnotherClass.DefaultInner defAno = new AnotherClass().new DefaultInner();
        defAno.show();

        AnotherClass another = new AnotherClass();
        //Это работает потому что объект класса privateInner создается внутри класса SomeClass. 
        // Т.е. когда создается экземпляр подкласса помимо него создается сам класс, по этому такое поведение позможно 
        another.testPrivate();
    }
}
