package ilovepet.models;

public class Rato extends Animal {

    public Rato(String name, int age) {
        super(name, age);
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
                "name=" + this.getName() +
                ", age='" + this.getAge() + '\'' +
                '}';
    }
    
}
