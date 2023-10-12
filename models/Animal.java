package ilovepet.models;

public abstract class Animal {
    private int id;
    private String name;
    private int age;
    private int energy = 0;

    public Animal(int id, String name, int age, int energy) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.energy = energy;
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

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    abstract void walk();

    abstract void eat(Food food);



}
