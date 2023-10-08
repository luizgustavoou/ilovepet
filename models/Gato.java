package ilovepet.models;

public class Gato extends Animal {

    public Gato(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
    }

    @Override
    void walk() {
        // TODO Auto-generated method stub
        System.out.println("Gato andando...");
    }

    @Override
    void eat() {
        // TODO Auto-generated method stub
        System.out.println("Gato comendo...");
    }
    
}
