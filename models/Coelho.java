package ilovepet.models;

public class Coelho extends Animal{

    public Coelho(String name, int age) {
        super(name, age);
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
                "name=" + this.getName() +
                ", age='" + this.getAge() + '\'' +
                '}';
    }
    
}
