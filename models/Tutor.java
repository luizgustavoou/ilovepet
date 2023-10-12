package ilovepet.models;

import java.util.ArrayList;

/*
 * Tutor de Animal de Estimação:

Descrição: Um tutor de animal de estimação é alguém que possui um animal de estimação e é responsável por cuidar dele.
Ações no Sistema: Pode se cadastrar no sistema, fornecer informações sobre seu animal de estimação, como espécie (cão, gato, coelho, rato), nome, idade, entre outros detalh
 */
public class Tutor extends Usuario {
    static private int nextId = 0;
    private int id;
    private ArrayList<Animal> animaisEstimacao;

    public Tutor(String name, int age, ArrayList<Animal> animaisEstimacao) {
        super(name, age);
        this.animaisEstimacao = animaisEstimacao;
        this.id = nextId++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tutor(String name, int age) {
        super(name, age);
        this.animaisEstimacao = new ArrayList<Animal>();

    }

    public ArrayList<Animal> getAnimaisEstimacao() {
        return animaisEstimacao;
    }

    public void setAnimaisEstimacao(ArrayList<Animal> animaisEstimacao) {
        this.animaisEstimacao = animaisEstimacao;
    }

    public void addAnimalEstimacao(Animal animal) {
        this.animaisEstimacao.add(animal);
    }

    @Override
    public String toString() {
        String retorno = "Tutor{" +
                "id=" + this.getId() +
                ", name=" + this.getName() +
                ", age='" + this.getAge() + '\'' + ", animaisEstimacao=[";

        for (Animal animal : this.animaisEstimacao) {
            retorno += animal.toString() + ", ";
        }

        retorno += "]";
        retorno += '}';

        return retorno;
    }

}
