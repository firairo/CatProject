import Cat.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasia");
        Cat cat2 = new Cat("Murka", 5);
        Cat cat3 = new Cat("Alex", 5);
        Cat cat4 = new Cat("Nusha", 15);

        System.out.println(cat4.getNumberOfObject());
    }
}