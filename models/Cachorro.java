package ilovepet.models;

public class Cachorro extends Animal {

    public Cachorro(String name, int age) {
        super(name, age);
    }

    @Override
    void walk() {
        System.out.println("Cachorro andando...");
    }

    @Override
    void eat() {
        int quantMeals = getQuantityMeals();
        if(quantMeals <= 2) {
            System.out.println("Cachorro comendo...");
            setQuantityMeals(quantMeals + 1);
        }
        else
            System.out.println("Cachorro já teve 2 refeições!");
    }
    
    @Override
    public String toString() {
        return "Cachorro{" +
                "name=" + this.getName() +
                ", age='" + this.getAge() + '\'' +
                '}';
    }
    
}
