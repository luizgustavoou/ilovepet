package ilovepet.models;

public class Cachorro extends Animal {
    private static int nextId = 0;
    private int id;

    public Cachorro(String name, int age) {
        super(name, age);
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    void walk() {
        System.out.println("Cachorro andando...");
    }

    @Override
    void eat(Food food) {
        int energy = getEnergy();
        if (energy <= 100) {
            System.out.println("Cachorro comendo...");
            setEnergy(energy + food.getNutrition());
        } else
            System.out.println("Cachorro já está cheio de refeições!");
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
