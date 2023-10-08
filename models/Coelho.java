package ilovepet.models;

public class Coelho extends Animal{

    public Coelho(String name, int age) {
        super(name, age);
    }

    @Override
    void walk() {
        System.out.println("Coelho andando...");
    }

    @Override
    void eat() {
        System.out.println("Coelho comendo...");
    }

    @Override
    public String toString() {
        return "Coelho{" +
                "name=" + this.getName() +
                ", age='" + this.getAge() + '\'' +
                '}';
    }
    
}
