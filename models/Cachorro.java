package ilovepet.models;

public class Cachorro extends Animal {

    public Cachorro(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    void walk() {
        System.out.println("Cachorro andando...");
    }

    @Override
    void eat(Food food) {
        int energy = getEnergy();
        if(energy <= 2) {
            System.out.println("Cachorro comendo...");
            setEnergy(energy + 1);
        }
        else
            System.out.println("Cachorro já teve 2 refeições!");
    }
    
    @Override
    public String toString() {
        return "Cachorro{" +
                "id=" + this.getId() +
                ", name=" + this.getName() +
                ", age='" + this.getAge() +
                ", energy=" + this.getEnergy() + '\'' +
                '}';
    }
    
}
