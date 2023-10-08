package ilovepet.models;

public class Gato extends Animal {

    public Gato(String name, int age) {
        super(name, age);
    }

    @Override
    void walk() {
        System.out.println("Gato andando...");
    }

    @Override
    void eat() {
        System.out.println("Gato comendo...");
    }
    
}
