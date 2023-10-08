package ilovepet.models;

public class Rato extends Animal {

    public Rato(String name, int age) {
        super(name, age);
    }

    @Override
    void walk() {
        System.out.println("Rato andando...");
    }

    @Override
    void eat() {
        System.out.println("Rato comendo...");
    }
    
}
