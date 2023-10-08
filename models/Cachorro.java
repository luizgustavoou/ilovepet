package ilovepet.models;

public class Cachorro extends Animal {

    public Cachorro(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
    }

    @Override
    void walk() {
        // TODO Auto-generated method stub
        System.out.println("Cachorro andando...");
    }

    @Override
    void eat() {
        // TODO Auto-generated method stub
        System.out.println("Cachorro comendo...");
    }
    
}
