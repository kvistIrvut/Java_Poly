package Practice_19_use_of_super_this;

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

}

class Calf extends Cow{
    Calf(String name, String owner, int age){
        super(name,age,owner);
    }
    
    void newOwner(String name){
        super.m_owner = name;
    }
    
    void makeFriendlySound(){
        System.out.print("Frendly");
        super.makeSound();
    }
}

public class Task1 {
    public static void main(String[] args) {
        Calf calf = new Calf("Vitja", "Nikolay",0);
        calf.makeFriendlySound();
        calf.newOwner("Olesya");        
    }
}
