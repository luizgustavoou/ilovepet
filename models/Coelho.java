package ilovepet.models;

public class Coelho extends Animal{

    public Coelho(int id, String name, int age, int quantityMeals) {
        super(id, name, age, quantityMeals);
    }

    @Override
    void walk() {
        System.out.println("Coelho andando...");
    }

    @Override
    void eat() {
        int quantMeals = getQuantityMeals();
        if(quantMeals <= 1) {
            System.out.println("Coelho comendo...");
            setQuantityMeals(quantMeals + 1);
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
                ", quantityMeals=" + this.getQuantityMeals() + '\'' +
                '}';
    }
    
}
