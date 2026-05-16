package Practice_18_Final_classes;

class Cow {
    public final void makeSound() {
        System.out.println("Moo");
    }
}

class Calf extends Cow {
    @Override
    public void makeSound() {
        System.out.println("MOOO!");
    }
}


