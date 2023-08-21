package Cat;

public class Cat {
    private static int numberOfObject;
    private String name;
    private int age;
    private Boolean isAlex = false;

    public int getNumberOfObject() {
        return numberOfObject;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boolean getAlex() {
        return isAlex;
    }

    public Cat(String name) {
        this.name = name;
        checkNameIsAlex(name);
        numberOfObject++;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        checkNameIsAlex(name);
        numberOfObject++;
    }

    private void checkNameIsAlex(String name) {
        this.isAlex = name.equals("Alex");
    }
}
