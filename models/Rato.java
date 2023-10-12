package ilovepet.models;

public class Rato extends Animal {

    public Rato(int id, String name, int age, int quantityMeals) {
        super(id, name, age, quantityMeals);
    }

    @Override
    void walk() {
        System.out.println("Rato andando...");
    }

    @Override
    void eat() {
        int quantMeals = getQuantityMeals();
        if(quantMeals <= 3) {
            System.out.println("Rato comendo...");
            setQuantityMeals(quantMeals + 1);
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
                ", quantityMeals=" + this.getQuantityMeals() + '\'' +
                '}';
    }
    
}
