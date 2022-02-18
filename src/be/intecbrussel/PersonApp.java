package be.intecbrussel;

public class PersonApp {

    public static void main(String[] args) {

        Person alex = new Person();
        alex.setName("Alexander");
        alex.setSurname("Keisse");
        alex.setAge(32);
        alex.setHeight(187);
        alex.setWeight(99);

        System.out.println("Name of the person: " + alex.getName());
        System.out.println("Surname of the person: " + alex.getSurname());
        System.out.println("Age of the person: " + alex.getAge());
        System.out.println("Height of the person: " + alex.getHeight());
        System.out.println("Weight of the person: " + alex.getWeight());
        System.out.println();

        Person bilal = new Person("Bilal", "Arragragui", 56);
        bilal.setHeight(175);
        bilal.setWeight(200);

        System.out.println("Name of the person: " + bilal.getName());
        System.out.println("Surname of the person: " + bilal.getSurname());
        System.out.println("Age of the person: " + bilal.getAge());
        System.out.println("Height of the person: " + bilal.getHeight());
        System.out.println("Weight of the person: " + bilal.getWeight());
        System.out.println();

        Person bart = new Person("Bart", "Hunerbein", 33, 178, 78);

        System.out.println("Name of the person: " + bart.getName());
        System.out.println("Surname of the person: " + bart.getSurname());
        System.out.println("Age of the person: " + bart.getAge());
        System.out.println("Height of the person: " + bart.getHeight());
        System.out.println("Weight of the person: " + bart.getWeight());

    }

}
