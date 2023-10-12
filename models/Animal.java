package ilovepet.models;

public abstract class Animal {
    private int id;
    private String name;
    private int age;
    private int quantityMeals = 0;

    public Animal(int id, String name, int age, int quantityMeals) {
        this.it = id;
        this.name = name;
        this.age = age;
        this.quantityMeals = quantityMeals;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getQuantityMeals() {
        return quantityMeals;
    }

    public void setQuantityMeals(int quantityMeals) {
        this.quantityMeals = quantityMeals;
    }

    abstract void walk();

    abstract void eat();



}
