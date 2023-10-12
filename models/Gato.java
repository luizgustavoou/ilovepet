package ilovepet.models;

public class Gato extends Animal {

    public Gato(String name, int age) {
        super(name, age);
    }

    @Override
    void walk() {
        System.out.println("Gato andando...");
    }

    @Override
    void eat() {
        int quantMeals = getQuantityMeals();
        if(quantMeals <= 5) {
            System.out.println("Gato comendo...");
            setQuantityMeals(quantMeals + 1);
        }
        else
            System.out.println("Gato já teve 5 refeições!");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name=" + this.getName() +
                ", age='" + this.getAge() + '\'' +
                '}';
    }
    
}
