package Practice_34_MyExept;

class CowAgeException extends Exception {

    public CowAgeException() {
        super();
    }

    public CowAgeException(String message) {
        super(message);
    }

    public CowAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

class Cow {
    private String name;
    private int age;

    public Cow(String name, int age) throws CowAgeException {

        if (age < 0) {
            throw new CowAgeException(
                "Возраст коровы не может быть отрицательным: " + age
            );
        }

        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Корова: " + name + ", возраст: " + age);
    }
}

public class Task1 {

    public static void main(String[] args) {

        try {

            Cow cow = new Cow("Буренка", -5);
            cow.printInfo();

        } catch (CowAgeException e) {

            System.out.println("Ошибка: " + e.getMessage());

        }
    }
}
