package ilovepet.models;

public class Coelho extends Animal {
    static private int nextId = 0;
    private int id;

    public Coelho(String name, int age) {
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
        System.out.println("Coelho andando...");
    }

    @Override
    void eat(Food food) {
        int energy = getEnergy();
        if (energy <= 100) {
            System.out.println("Coelho comendo...");
            setEnergy(energy + food.getNutrition());
        } else
            System.out.println("Coelho já está cheio de refeições!");
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
