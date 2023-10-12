package ilovepet.models;

public class Rato extends Animal {

    public Rato(int id, String name, int age, int energy) {
        super(id, name, age, energy);
    }

    @Override
    void walk() {
        System.out.println("Rato andando...");
    }

    @Override
    void eat(Food food) {
        int energy = getEnergy();
        if(energy <= 3) {
            System.out.println("Rato comendo...");
            setEnergy(energy + 1);
        }
        else
            System.out.println("Rato já teve 3 refeições!");
    }

    @Override
    public String toString() {
        return "Rato{" +
                "id=" + this.getId() +
                ", name=" + this.getName() +
                ", age='" + this.getAge() +
                ", energy=" + this.getEnergy() + '\'' +
                '}';
    }
    
}
