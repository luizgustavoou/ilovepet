package ilovepet.models;

public class Rato extends Animal {

    public Rato(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
    }

    @Override
    void walk() {
        // TODO Auto-generated method stub
        System.out.println("Rato andando...");
    }

    @Override
    void eat() {
        // TODO Auto-generated method stub
        System.out.println("Rato comendo...");
    }
    
}
