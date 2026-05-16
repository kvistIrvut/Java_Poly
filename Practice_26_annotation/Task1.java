package Practice_26_annotation;

class Cow {
    //Указание на то что код утстарел и его применение требует осторожности
    @Deprecated
    public void makeSound_old() {
        System.out.println("Moo_old");
    }

    public void makeSound() {
        System.out.println("Moo");
    }
}

class Calf extends Cow {
    //Override используятся чтобы указать что функцию  для объекта надо брать из подкласса а не его родительского класса.
    @Override
    public void makeSound() {
        System.out.println("MOOO!");
    }
}



public class Task1 {
    @SuppressWarnings("deprecation")//Данная анотация указывает что мы подавляем варнинги от компилятора.
    //В данном случае мы подавляем варниг отвественный за указание на то что мы используем Deprecated код
    public static void main(String[] args) {
        Cow cow = new Cow();
        
        cow.makeSound_old();
    }
}
