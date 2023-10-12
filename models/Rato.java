package ilovepet.models;

public class Rato extends Animal {
    private static int nextId = 0;
    private int id;

    public Rato(String name, int age) {
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
        System.out.println("Rato andando...");
    }

    @Override
    void eat(Food food) {
        int energy = getEnergy();
        if (energy <= 3) {
            System.out.println("Rato comendo...");
            setEnergy(energy + 1);
        } else
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
