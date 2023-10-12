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
    public void walk() {
        int newEnergy = this.getEnergy() - 10;

        if (newEnergy < 0) {
            System.out.println("Miau, não posso andar.");
            return;
        }

        System.out.println("Gato andando...");
        this.setEnergy(newEnergy);
    }

    @Override
    public void eat(Food food) {
        int newEnergy = getEnergy() + food.getNutrition();
        if (newEnergy <= 100) {
            System.out.println("Gato " + this.getName() + " comendo...");
            setEnergy(newEnergy);
        } else
            System.out.println("Gato " + this.getName() + " já está cheio de refeições!");
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
