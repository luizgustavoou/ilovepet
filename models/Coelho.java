package ilovepet.models;

public class Coelho extends Animal{

    public Coelho(int id, String name, int age, int energy) {
        super(id, name, age, energy);
    }

    @Override
    void walk() {
        System.out.println("Coelho andando...");
    }

    @Override
    void eat(Food food) {
        int energy = getEnergy();
        if(energy <= 1) {
            System.out.println("Coelho comendo...");
            setEnergy(energy + 1);
        }
        else
            System.out.println("Coelho já teve sua refeição!");
    }

    @Override
    public String toString() {
        return "Coelho{" +
                "id=" + this.getId() +
                ", name=" + this.getName() +
                ", age='" + this.getAge() +
                ", energy=" + this.getEnergy() + '\'' +
                '}';
    }
    
}
