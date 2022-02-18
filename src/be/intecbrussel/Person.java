package be.intecbrussel;

public class Person {

    // Instance members
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;

    // Constructor

    public Person() {
        this(null, null, 0, 0, 0);
    }

    public Person(String name, String surname, int age) {
        this(name, surname, age, 0, 0);
    }

    public Person(String name, String surname, int age, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
