package ilovepet.models;

public class Gato extends Animal {
    static private int nextId = 0;
    private int id;

    public Gato(String name, int age) {
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
        System.out.println("Gato andando...");
    }

    @Override
    void eat(Food food) {
        int energy = getEnergy();
        if (energy <= 100) {
            System.out.println("Gato comendo...");
            setEnergy(energy + food.getNutrition());
        } else
            System.out.println("Gato já está cheio de refeições!");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "id=" + this.getId() +
                ", name=" + this.getName() +
                ", age='" + this.getAge() +
                ", energy=" + this.getEnergy() + '\'' +
                '}';
    }

}
