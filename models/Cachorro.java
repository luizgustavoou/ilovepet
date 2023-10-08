package ilovepet.models;

public class Cachorro extends Animal {

    public Cachorro(String name, int age) {
        super(name, age);
    }

    @Override
    void walk() {
        System.out.println("Cachorro andando...");
    }

    @Override
    void eat() {
        System.out.println("Cachorro comendo...");
    }
    
    @Override
    public String toString() {
        return "Cachorro{" +
                "name=" + this.getName() +
                ", age='" + this.getAge() + '\'' +
                '}';
    }
    
}
