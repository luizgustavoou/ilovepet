package ilovepet.models;

public class Coelho extends Animal{

    public Coelho(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
    }

    @Override
    void walk() {
        // TODO Auto-generated method stub
        System.out.println("Coelho andando...");
    }

    @Override
    void eat() {
        // TODO Auto-generated method stub
        System.out.println("Coelho comendo...");
    }
    
}
